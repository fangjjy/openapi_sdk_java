package com.fang.openapi.dto.house;

import com.fang.openapi.dto.photo.HousePhotoDTO;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.LinkedList;
import java.util.List;

/**
 * 商铺出售DTO
 *
 * @version 1.0.0
 * @author: Songle
 * @create: 2018-06-11 09:49
 **/
@JsonTypeName("商铺")
public class ShopSaleDTO extends SaleHouseAbstractDTO {
    public ShopSaleDTO() {
        this.setPurposeType("Shop");
        this.image6 = new LinkedList <>();
        this.image7 = new LinkedList <>();
    }

    /***
     * 类别，必须在存在于搜房帮，可以到搜房帮的页面查看
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
     * 配套设施
     */
    private String baseService;
    /**
     * 目标业态
     */
    private String aimOperastion;
    /**
     * 房源标签
     */
    private String feature;
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

    public String getBaseService() {
        return baseService;
    }

    public void setBaseService(String baseService) {
        this.baseService = baseService;
    }


    public String getAimOperastion() {
        return aimOperastion;
    }

    public void setAimOperastion(String aimOperastion) {
        this.aimOperastion = aimOperastion;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public List <HousePhotoDTO> getImage6() {
        return image6;
    }

    public List <HousePhotoDTO> getImage7() {
        return image7;
    }

}
