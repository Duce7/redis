package cn.victorplus.vehicle.service;

import cn.victorplus.vehicle.tools.StringUtils;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class RedisService {
    private Logger log = LoggerFactory.getLogger(RedisService.class);
    @Resource
    private StringRedisTemplate redis;

    /**
     * redis存放key-value
     *
     */
    public void setValue(String key, Object obj, long timeout) {
        try {
            String json = JSON.toJSONString(obj);

            redis.opsForValue().set(key, json, timeout, TimeUnit.SECONDS);
        } catch (Exception e) {
            log.error("RedisService.setValue()方法出现异常！", e);
        }
    }

    /**
     * redis获取key对应的value
     *
     */
    public <T> T getValue(String vkey, Class<T> clazz) {
        try {
            String jsonUser = redis.opsForValue().get(vkey);

            if (StringUtils.isNotBlank(jsonUser)) {
                return JSON.parseObject(jsonUser, clazz);
            }
        } catch (Exception e) {
            log.error("RedisService.getValue()方法出现异常！", e);
        }
        return null;
    }

    /**
     * redis存放集合，存放前会先进行删除操作
     *
     */
    public void addList(String vkey, List<?> lstObj) {
        try {
            redis.delete(vkey);
            for (Object obj: lstObj) {
                redis.opsForList().rightPush(vkey, JSON.toJSONString(obj));
            }
        } catch (Exception e) {
            log.error("RedisService.addList()方法出现异常！", e);
        }
    }

    /**
     * redis获取集合数据
     *
     */
    public <T> List<T> getListAll(String vkey, Class<T> clazz){
        try {
            List<String> lstValue = redis.opsForList().range(vkey, 0, -1);
            List<T> lstAllObj = new ArrayList<T>();

            if (null != lstValue) {
                for (String value : lstValue) {
                    lstAllObj.add(JSON.parseObject(value, clazz));
                }
            }
            return lstAllObj;
        } catch (Exception e) {
            log.error("RedisService.getListAll()方法出现异常！", e);
        }
        return null;
    }

    /**
     * redis删除存放的信息
     *
     */
    public void delete(String vkey) {
        try {
            redis.delete(vkey);
        } catch (Exception e) {
            log.error("RedisService.delete()方法出现异常！", e);
        }
    }

    /**
     * redis是否存放有这个key对应数据
     * @param vkey
     * @return
     */
    public boolean isExist(String vkey) {
        String jsonUser = null;

        try {
            jsonUser = redis.opsForValue().get(vkey);
        } catch (Exception e) {
            log.error("RedisService.isExist()方法出现异常！", e);
        }

        return StringUtils.isNotBlank(jsonUser);
    }

    public void selectDB(Integer db) {
        LettuceConnectionFactory connectionFactory = (LettuceConnectionFactory) redis.getConnectionFactory();
        connectionFactory.setDatabase(db);
    }

    public boolean hasKey(String key) {
        return redis.hasKey(key);
    }

    public boolean deleteKey(String key) {
        try{
            redis.delete(key);
            return true;
        }catch (Exception e){
            log.info("redis删除key={}出现异常,{}", key, e);
        }
        return false;
    }

    /**
     * 增加同步锁
     * @param key               锁key
     * @param expireSeconds     过期时间，单位秒
     * @return
     */
    public boolean tryLock(String key, long expireSeconds) {
        try {
            String uuid = UUID.randomUUID().toString();
            Boolean isOk = redis.opsForValue().setIfAbsent(key, uuid);
            if (isOk) {
                redis.expire(key, expireSeconds, TimeUnit.SECONDS);
            }
            return isOk;
        } catch (Exception e) {
            log.error("Redis同步锁设置异常！", e);
        }
        return false;
    }

    /**
     * 释放同步锁
     * @param key   锁key
     * @return
     */
    public boolean releaseLock(String key) {
        try{
            String uuid = redis.opsForValue().get(key);

            if (StringUtils.isNotBlank(uuid)) {
                redis.delete(key);
            }
            return true;
        }catch (Exception e){
            log.error("Redis同步锁释放异常！", e);
        }
        return false;
    }

}
