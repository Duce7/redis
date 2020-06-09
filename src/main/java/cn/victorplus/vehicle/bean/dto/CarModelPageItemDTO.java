package cn.victorplus.vehicle.bean.dto;

import cn.victorplus.vehicle.bean.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * <p></p>
 *
 * @author : Zhao Yun
 * @since : 2018/09/07 14:19
 */
@Getter
@Setter
public class CarModelPageItemDTO extends BaseEntity {

    private String bName;
    private String fName;
    private String sName;
    private String yName;
    private String mName;
    private String cuname;
    private Long mid;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

}
