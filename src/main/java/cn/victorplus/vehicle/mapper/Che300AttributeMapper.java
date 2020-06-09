//package cn.victorplus.vehicle.mapper;
//
//import cn.victorplus.vehicle.bean.db.Che300Attribute;
//import org.apache.ibatis.annotations.Param;
//
//import java.util.Collection;
//import java.util.List;
//
///**
// * <p>车300详细参数</p>
// */
//public interface Che300AttributeMapper extends BaseMapper<CarPara> {
//
//    List<Che300Attribute> findByModelId(@Param("modelId") Long modelId);
//
//    Integer countByModelId(@Param("modelId") Long modelId);
//
//    void batchAdd(@Param("collect") Collection<Che300Attribute> collect);
//
//    void add(Che300Attribute attribute);
//
//}
