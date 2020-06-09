package cn.victorplus.vehicle.bean.dto;

import lombok.Data;

/**
 * @author jim lin
 * @date 2019/7/23.
 */
@Data
public class UserDefinedCarBrandDTO {

    /** ID  */
    private Long id;
    /** 名称  */
    private String name;
    /** 首字母  */
    private String firstletter;
}
