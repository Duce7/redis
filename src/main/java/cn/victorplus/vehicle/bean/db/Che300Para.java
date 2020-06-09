package cn.victorplus.vehicle.bean.db;



import cn.victorplus.vehicle.bean.BaseEntity;

import java.util.Date;

/**
 * @description : <p>车300详细参数</p>
 * @author : Zhao Yun
 * @since : 2018/10/29 10:47
 */
public class Che300Para extends BaseEntity {

    /* Zhao Yun 2018/10/29 主键id */
    private Long id;
    /* Zhao Yun 2018/10/29 车型ID */
    private Integer modelId;
    /* Zhao Yun 2018/10/29 参数类型 */
    private String paraType;
    /* Zhao Yun 2018/10/29 参数key */
    private String paraKey;
    /* Zhao Yun 2018/10/29 参数值 */
    private String paraValue;
    /* Zhao Yun 2018/10/29  */
    private Date created;
    /* Zhao Yun 2018/10/29  */
    private Date modified;
    public Che300Para() {
    }

    public Che300Para(
            Long id,
            Integer modelId,
            String paraType,
            String paraKey,
            String paraValue,
            Date created,
            Date modified) {
        this.id = id;
        this.modelId = modelId;
        this.paraType = paraType;
        this.paraKey = paraKey;
        this.paraValue = paraValue;
        this.created = created;
        this.modified = modified;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getParaType() {
        return paraType;
    }

    public void setParaType(String paraType) {
        this.paraType = paraType;
    }

    public String getParaKey() {
        return paraKey;
    }

    public void setParaKey(String paraKey) {
        this.paraKey = paraKey;
    }

    public String getParaValue() {
        return paraValue;
    }

    public void setParaValue(String paraValue) {
        this.paraValue = paraValue;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Override
    public String toString() {
        return "Che300Para{" +
            "id=" + id +
            ", modelId=" + modelId +
            ", paraType=\"" + paraType + '\"' +
            ", paraKey=\"" + paraKey + '\"' +
            ", paraValue=\"" + paraValue + '\"' +
            ", created=" + created +
            ", modified=" + modified +
        '}';
    }

}