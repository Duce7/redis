package cn.victorplus.vehicle.mapper;

import cn.victorplus.vehicle.bean.db.Che300Vehicle;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;


public interface Che300VehicleMapper extends BaseMapper<Che300Vehicle> {


    void addChe300Model(Che300Vehicle che300Model);


    void addIgnoreChe300Model(Che300Vehicle che300Model);


    int countModels(Long modelId);


    void addChe300Models(@Param("collect") Collection<Che300Vehicle> collect);


    void addIgnoreChe300Models(@Param("collect") Collection<Che300Vehicle> collect);


    Che300Vehicle findById(@Param("modelId") Long modelId);


    Che300Vehicle findByModelId(@Param("modelId") Long modelId);


    List<Che300Vehicle> getModelsBySeries(@Param("brandId") Long brandId, @Param("seriesId") Long seriesId);


    List<Che300Vehicle> getModelsByBrandAndSeries(@Param("brandId") Long brandId, @Param("seriesId") Long seriesId);


    void updateChe300Model(Che300Vehicle che300Model);


    void updateByChe300ModelId(Che300Vehicle che300Model);


    void updateChe300ModelEmptyProp(@Param("originChe300Model") Che300Vehicle originChe300Model
            , @Param("newChe300Model") Che300Vehicle newChe300Model);


    List<Che300Vehicle> findByVin(@Param("vin") String vin);


    List<Che300Vehicle> findByName(@Param("name") String name, @Param("index") int index, @Param("size") int size);


    void deletePositiveId();

}
