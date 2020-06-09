package cn.victorplus.vehicle.bean.dto;

import cn.victorplus.vehicle.bean.db.CarSeries;

public class CarSeriesDTO extends CarSeries {

	/**
	 * 
	 */
	private static final long serialVersionUID = 990883662198988936L;


	private String sGroupName;

	public String getsGroupName() {
		return sGroupName;
	}

	public void setsGroupName(String sGroupName) {
		this.sGroupName = sGroupName;
	}
}
