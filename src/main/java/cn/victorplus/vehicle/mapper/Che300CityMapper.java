package cn.victorplus.vehicle.mapper;

import cn.victorplus.vehicle.bean.db.Che300City;

/**
 * <p></p>
 */
public interface Che300CityMapper extends BaseMapper<Che300City> {

    /**
     * <p>单个添加，忽略已存在的</p>
     * @author : Zhao Yun
     * @since : 2018/04/10 14:01
     */
    void addIgnoreBitCity(Che300City che300City);


}
