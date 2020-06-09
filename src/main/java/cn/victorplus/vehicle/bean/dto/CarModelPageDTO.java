package cn.victorplus.vehicle.bean.dto;

import cn.victorplus.vehicle.bean.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p></p>
 *
 * @author : Zhao Yun
 * @since : 2018/09/07 14:19
 */
@Getter
@Setter
public class CarModelPageDTO extends BaseEntity {

    private Integer totalCount;
    private List<CarModelPageItemDTO> list;

}
