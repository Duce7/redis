package cn.victorplus.vehicle.controller;

import cn.victorplus.vehicle.bean.Response;
import cn.victorplus.vehicle.service.CarDateService;
import cn.victorplus.vehicle.service.DateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("/car")
public class CarInfoController {

    @Resource
    private CarDateService service;

    @Resource
    private DateService dateService;

    @GetMapping(value = "/getData")
    public Response getBrand() {
//        service.getData();
        dateService.getData();
        return Response.success();
    }
}
