package cn.victorplus.vehicle.bean.dto;


import java.math.BigDecimal;

public class CarAssessResultDTO {

    /* 车况好-参考价 */
    private Double goodReference;
    /* 车况正常-参考价 */
    private Double normalReference;
    /* 车况差-参考价 */
    private Double badReference;
    private Integer assessType;

    public Double getGoodReference() {
        return goodReference;
    }

    public void setGoodReference(Double goodReference) {
        this.goodReference = BigDecimal.valueOf(goodReference).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Double getNormalReference() {
        return normalReference;
    }

    public void setNormalReference(Double normalReference) {
        this.normalReference = BigDecimal.valueOf(normalReference).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Double getBadReference() {
        return badReference;
    }

    public void setBadReference(Double badReference) {
        this.badReference = BigDecimal.valueOf(badReference).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Integer getAssessType() {
        return assessType;
    }

    public void setAssessType(Integer assessType) {
        this.assessType = assessType;
    }

    public boolean hasPrice() {
        return badReference != null && normalReference != null && goodReference != null;
    }

    @Override
    public String toString() {
        return "CarAssessResultDTO{" +
                ", goodReference=" + goodReference +
                ", normalReference=" + normalReference +
                ", badReference=" + badReference +
                ", assessType=" + assessType +
                '}';
    }

}
