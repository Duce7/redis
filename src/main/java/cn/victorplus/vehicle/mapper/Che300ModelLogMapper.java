package cn.victorplus.vehicle.mapper;

import cn.victorplus.vehicle.bean.db.Che300ModelLog;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.Date;

/**
 * <p>车300请求日志表</p>
 * @author : Zhao Yun
 * @since : 2018/04/28 11:27
 */
public interface Che300ModelLogMapper {

    /**
     * <p>单个添加车300请求日志表</p>
     * @author : Zhao Yun
     * @since : 2018/04/28 11:27
     */
    void addChe300ModelLog(Che300ModelLog che300ModelLog);

    /**
     * <p>单个添加车300请求日志表，忽略已存在的</p>
     * @author : Zhao Yun
     * @since : 2018/04/28 11:27
     */
    void addIgnoreChe300ModelLog(Che300ModelLog che300ModelLog);

    /**
     * <p>批量添加车300请求日志表</p>
     * @author : Zhao Yun
     * @since : 2018/04/28 11:27
     */
    void addChe300ModelLogs(@Param("collect") Collection<Che300ModelLog> collect);

    /**
     * <p>批量添加车300请求日志表，忽略已存在的</p>
     * @author : Zhao Yun
     * @since : 2018/04/28 11:27
     */
    void addIgnoreChe300ModelLogs(@Param("collect") Collection<Che300ModelLog> collect);

    /**
     * <p>根据主键查询车300请求日志表</p>
     * @author : Zhao Yun
     * @since : 2018/04/28 11:27
     */
    Che300ModelLog findById(@Param("id") Long id);




    Che300ModelLog queryByParamsKey(@Param("paramsKey") String paramsKey,
                                    @Param("fromDate") Date fromDate);

    Che300ModelLog queryByVin(@Param("vin") String vin,
                              @Param("fromDate") Date fromDate);

    /**
     * <p>更新车300请求日志表</p>
     * @author : Zhao Yun
     * @since : 2018/04/28 11:27
     */
    void updateChe300ModelLog(Che300ModelLog che300ModelLog);

    /**
     * <p>更新车300请求日志表，旧的不为空的数据不更新</p>
     * @author : Zhao Yun
     * @since : 2018/04/28 11:27
     */
    void updateChe300ModelLogEmptyProp(@Param("originChe300ModelLog") Che300ModelLog originChe300ModelLog
            , @Param("newChe300ModelLog") Che300ModelLog newChe300ModelLog);

}
