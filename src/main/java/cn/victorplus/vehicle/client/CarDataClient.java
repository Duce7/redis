package cn.victorplus.vehicle.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@Transactional(propagation = Propagation.NOT_SUPPORTED)
@FeignClient(name="carData-client",url = "${che300.api.domain}")
public interface CarDataClient {


    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE ,path = "/service/getCarBrandList")
    String getCarBrandList(@RequestParam("token") String token);
    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE ,path = "/service/getCarSeriesList")
    String getCarSeriesList(@RequestParam("token") String token,@RequestParam("brandId") Long brandId);
    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE ,path = "/service/getCarModelList")
    String getCarModelList(@RequestParam("token") String token,@RequestParam("seriesId") Long seriesId);


}
