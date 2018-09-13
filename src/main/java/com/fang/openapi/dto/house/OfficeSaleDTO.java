package com.fang.openapi.dto.house;


import com.fang.openapi.dto.photo.HousePhotoDTO;

import java.util.LinkedList;
import java.util.List;

/**
 * 写字楼出售DTO
 *
 * @version 1.0.0
 * @author: Songle
 * @create: 2018-06-11 09:57
 **/
public class OfficeSaleDTO extends SaleHouseAbstractDTO {
    public OfficeSaleDTO() {
        this.setPurposeType("Office");
        this.image4 = new LinkedList <>();
        this.image5 = new LinkedList <>();
        this.image6 = new LinkedList <>();
        this.image7 = new LinkedList <>();
    }

    /***
     * 类别，来自与客服后台的录入
     */
    private String subType;
    /**
     * 物业费
     */
    private Double propFee;
    /**
     * 所在楼层
     */
    private Short floor;
    /**
     * 是否可分割
     */
    private Integer isDivisi;
    /**
     * 装修程度
     */
    private String fitment;
    /**
     * 写字楼级别
     */
    private String propertyGrade;

    /**
     * 房源标签
     */
    private String feature;
    /**
     * 交通图
     */
    private List <HousePhotoDTO> image4;
    /**
     * 平面图
     */
    private List <HousePhotoDTO> image5;
    /**
     * 内景图
     */
    private List <HousePhotoDTO> image6;
    /**
     * 外景图
     */
    private List <HousePhotoDTO> image7;

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public Double getPropFee() {
        return propFee;
    }

    public void setPropFee(Double propFee) {
        this.propFee = propFee;
    }

    public Short getFloor() {
        return floor;
    }

    public void setFloor(Short floor) {
        this.floor = floor;
    }

    public Integer getIsDivisi() {
        return isDivisi;
    }

    public void setIsDivisi(Integer isDivisi) {
        this.isDivisi = isDivisi;
    }

    public String getFitment() {
        return fitment;
    }

    public void setFitment(String fitment) {
        this.fitment = fitment;
    }

    public String getPropertyGrade() {
        return propertyGrade;
    }

    public void setPropertyGrade(String propertyGrade) {
        this.propertyGrade = propertyGrade;
    }


    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public List <HousePhotoDTO> getImage4() {
        return image4;
    }

    public List <HousePhotoDTO> getImage5() {
        return image5;
    }

    public List <HousePhotoDTO> getImage6() {
        return image6;
    }

    public List <HousePhotoDTO> getImage7() {
        return image7;
    }

}
