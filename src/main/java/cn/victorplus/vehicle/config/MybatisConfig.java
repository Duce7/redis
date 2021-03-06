package cn.victorplus.vehicle.config;


import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import cn.victorplus.vehicle.tools.StaticUtils;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;


@Configuration
@MapperScan(basePackages = { StaticUtils.MAPPER_PATH})
public class MybatisConfig {
    Logger logger = LoggerFactory.getLogger(MybatisConfig.class);

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource(DataSourceProperties properties) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("url", properties.getUrl());
        map.put("driverClassName", properties.getDriverClassName());
        map.put("username", properties.getUsername());
        map.put("password", properties.getPassword());
        map.put("initialSize", "1");
        map.put("maxActive", "20");
        map.put("maxWait", "60000");
        map.put("timeBetweenEvictionRunsMillis", "60000");
        map.put("validationQuery", "SELECT 'x'");
        map.put("testWhileIdle", "true");
        map.put("testOnBorrow", "false");
        map.put("testOnReturn", "false");
        map.put("poolPreparedStatements", "false");
        DataSource dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(map);
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactory sqlSessionFactory = null;
        try {
            ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
            Properties p = new Properties();
            p.setProperty("dialect", "mysql");
            p.setProperty("pageSqlId", "ByPage");

            sessionFactory.setDataSource(dataSource);
            sessionFactory.setMapperLocations(resolver.getResources("classpath:/mapper/*Mapper.xml"));
            sqlSessionFactory = sessionFactory.getObject();
        } catch (Exception e) {
            logger.error("fail to init MyBatis sqlSessionFactory!", e);
        }
        return sqlSessionFactory;
    }

}