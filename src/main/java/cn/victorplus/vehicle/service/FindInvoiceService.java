package cn.victorplus.vehicle.service;

import cn.victorplus.vehicle.mapper.TPurchaserInvoiceMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FindInvoiceService {

    @Resource
    private TPurchaserInvoiceMapper mapper;


    public String query(Integer id) {
        return mapper.getList(id).toString();
    }
}
