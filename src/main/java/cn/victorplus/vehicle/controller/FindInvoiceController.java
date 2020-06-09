package cn.victorplus.vehicle.controller;


import cn.victorplus.vehicle.service.FindInvoiceService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/invoice")
public class FindInvoiceController {

    @Resource
    private FindInvoiceService service;

    @GetMapping("/query")
    public String query(@Param(value = "id") Integer id) {
        return service.query(id);
    }

    @GetMapping("/do")
    public String hello(@Param(value = "id") Integer id) {
        return "<p>这是个首页</p>";
    }
}
