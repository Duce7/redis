package cn.victorplus.vehicle.bean.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author wang wei
 * 2020/3/24 15:18
 */
@Data
public class AppletVehicleInfoDTO {

    /**
     * 车辆vin码
     */
    private String vin;
    /**
     * 车辆品牌
     */
    private Integer brand;
    /**
     * 车辆品牌名称
     */
    private String brandName;
    /**
     * 车系
     */
    private Integer series;
    /**
     * 车系名称
     */
    private String seriesName;
    /**
     * 车型
     */
    private Integer model;
    /**
     * 车系名称
     */
    private String modelName;
    /**
     * 年代ID
     */
    private Integer year;
    /**
     * 年代名称
     */
    private String yearName;
    /**
     * 变速箱
     */
    private Integer gearbox;
    /**
     * 排量/吨位
     */
    private String gear;
    /**
     * 燃料类型
     */
    private Integer fuel;
    /**
     * 车辆颜色
     */
    private Integer color;
    /**
     * 新车参考价
     */
    private BigDecimal referencePrice;
    /**
     * 发动机编号
     */
    private String engineNo;
    /**
     * 车类(用途  非营运/营转非)
     */
    private Integer purpose;
    /**
     * 过户次数
     */
    private Integer transferTotal;
    /**
     * 车辆类别  (乘用车/LCV)
     */
    private Integer category;
    /**
     * 车辆里程数/KM
     */
    private BigDecimal mileage;
    /**
     * 首次上牌时间
     */
    private Date firstRegisterDate;
    /**
     * 卖家姓名
     */
    private String saleName;
    /**
     * 卖家身份证号
     */
    private String saleIdno;
    /**
     * 录车人手机号
     */
    private String mobile;
    /**
     * 影像件列表
     */
//    private List<ImageInfoDTO> imageList;
}
