package cn.victorplus.vehicle.mapper;

import cn.victorplus.vehicle.bean.db.Che300Model;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

/**
 * <p>车300车型数据</p>
 * @author : Zhao Yun
 * @since : 2018/04/28 10:33
 */
public interface Che300ModelMapper {

    /**
     * <p>单个添加车300车型数据</p>
     * @author : Zhao Yun
     * @since : 2018/04/28 10:33
     */
    void addChe300Model(Che300Model che300Model);

    /**
     * <p>单个添加车300车型数据，忽略已存在的</p>
     * @author : Zhao Yun
     * @since : 2018/04/28 10:33
     */
    void addIgnoreChe300Model(Che300Model che300Model);

    /**
     * <p>批量添加车300车型数据</p>
     * @author : Zhao Yun
     * @since : 2018/04/28 10:33
     */
    void addChe300Models(@Param("collect") Collection<Che300Model> collect);

    /**
     * <p>批量添加车300车型数据，忽略已存在的</p>
     * @author : Zhao Yun
     * @since : 2018/04/28 10:33
     */
    void addIgnoreChe300Models(@Param("collect") Collection<Che300Model> collect);

    /**
     * <p>根据主键查询车300车型数据</p>
     * @author : Zhao Yun
     * @since : 2018/04/28 10:33
     */
    Che300Model findById(@Param("id") Long id);

    /**
     * <p>更新车300车型数据</p>
     * @author : Zhao Yun
     * @since : 2018/04/28 10:33
     */
    void updateChe300Model(Che300Model che300Model);

    /**
     * <p>更新车300车型数据，旧的不为空的数据不更新</p>
     * @author : Zhao Yun
     * @since : 2018/04/28 10:33
     */
    void updateChe300ModelEmptyProp(@Param("originChe300Model") Che300Model originChe300Model
            , @Param("newChe300Model") Che300Model newChe300Model);

    /**
     * <p>根据vin码获取车型数据</p>
     * @author : Zhao Yun
     * @since : 2018/4/28 10:42
     */
    List<Che300Model> findByVin(@Param("vin") String vin);

}
