package cn.victorplus.vehicle.bean.db;

import cn.victorplus.vehicle.bean.BaseEntity;

import java.util.Date;

/**
 * @description : <p>车300详细参数</p>
 */
public class Che300Attribute extends BaseEntity {

    private Long id;
    private Integer modelId;
    private String paraType;
    private String paraKey;
    private String paraValue;
    private Date created;
    private Date modified;
    public Che300Attribute() {
    }

    public Che300Attribute(
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
        return "Che300Attribute{" +
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