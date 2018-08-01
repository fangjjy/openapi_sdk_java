package com.fang.openapi.dto.house;

import com.fang.openapi.dto.photo.HousePhotoDTO;

import java.util.LinkedList;
import java.util.List;

/**
 * 商铺出租DTO
 *
 * @version 1.0.0
 * @author: Songle
 * @create: 2018-06-11 10:55
 **/
public class ShopLeaseDTO extends LeaseHouseAbstractDTO {
    public ShopLeaseDTO() {
        this.setPurposeType("Shop");
        this.image6 = new LinkedList <>();
        this.image7 = new LinkedList <>();
    }

    /***
     * 类别:住宅底商 商业街商铺 临街门面 写字楼配套底商 购物中心/百货 其他
     */
    private String subType;
    /**
     * 商铺状态: 营业中  闲置中 新铺
     */
    private String shopStatus;
    /**
     * 是否含物业费/管理费(0为不含；1为含)
     */
    private Integer isIncludFee;
    /**
     * 物业费
     */
    private Double propFee;
    /**
     * 是否转让:1/0
     */
    private Short isTransfer;
    /**
     * 支付方式(押一付三。年付等)
     */
    private String payDetail;
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
     * 转让费（商铺）
     */
    private Double transferFee;
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

    public String getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(String shopStatus) {
        this.shopStatus = shopStatus;
    }

    public Integer getIsIncludFee() {
        return isIncludFee;
    }

    public void setIsIncludFee(Integer isIncludFee) {
        this.isIncludFee = isIncludFee;
    }

    public Double getPropFee() {
        return propFee;
    }

    public void setPrropFee(Double propFee) {
        this.propFee = propFee;
    }

    public Short getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(Short isTransfer) {
        this.isTransfer = isTransfer;
    }

    public String getPayDetail() {
        return payDetail;
    }

    public void setPayDetail(String payDetail) {
        this.payDetail = payDetail;
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

    public Double getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(Double transferFee) {
        this.transferFee = transferFee;
    }

    public List <HousePhotoDTO> getImage6() {
        return image6;
    }

    public List <HousePhotoDTO> getImage7() {
        return image7;
    }


}
