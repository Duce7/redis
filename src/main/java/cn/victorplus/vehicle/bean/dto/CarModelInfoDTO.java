package cn.victorplus.vehicle.bean.dto;

import lombok.Data;

/**
 * @author	Wang Xu
 * @date	2019年7月16日 
 */
@Data
public class CarModelInfoDTO {
	/** 车型id */
	private Integer id;
	/** 年代款ID */
	private Integer yid;
	/** 车系ID */
	private Integer sid;
	/** 品牌ID */
	private Integer bid;
	/** 厂家ID */
	private Integer fid;
	/** 车型名称（全） */
	private String name;
	/** 车型名称 */
	private String mname;
	/** 车系名称 */
	private String sname;
	/** 年代款名称 */
	private String yname;
	/** 级别 */
	private String level;
	/** 驱动方式 */
	private String drivingmode;
	/** 状态 */
	private Integer state;
	/** 吨位 */
	private String tonnage;
	/** 排量 */
	private String liter;
	/** 变速箱 */
	private String gearbox;
	/** 厂商指导价 */
	private Integer msrp;
	/** 变速箱类型 */
	private String gear;
	/** 数据来源 */
	private String quote;
	/** 燃料类型 */
	private String fuel;
	/** 座位数 */
	private String seats;
	
}
