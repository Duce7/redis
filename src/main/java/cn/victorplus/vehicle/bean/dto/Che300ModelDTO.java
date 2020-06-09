package cn.victorplus.vehicle.bean.dto;

import cn.victorplus.vehicle.bean.db.Che300Model;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * <p></p>
 *
 * @author : Zhao Yun
 * @since : 2018/11/01 16:21
 */
@Getter
@Setter
public class Che300ModelDTO extends Che300Model {

    private Map<String, Map<String, String>> params;

}
