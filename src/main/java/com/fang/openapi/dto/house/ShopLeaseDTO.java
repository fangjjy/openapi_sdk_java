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
     * 类别
     */
    private String subType;
    /**
     * 商铺状态
     */
    private String shopStatus;
    /**
     * 是否含物业费/管理费(0为不含；1为含)
     */
    private Integer isIncludeFee;
    /**
     * 物业费
     */
    private Double propFee;
    /**
     * 是否转让
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
    private Integer isDivisibility;
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
     * 房源标题
     */
    private String boardTitle;
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

    public Integer getIsIncludeFee() {
        return isIncludeFee;
    }

    public void setIsIncludeFee(Integer isIncludeFee) {
        this.isIncludeFee = isIncludeFee;
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

    public Integer getIsDivisibility() {
        return isDivisibility;
    }

    public void setIsDivisibility(Integer isDivisibility) {
        this.isDivisibility = isDivisibility;
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

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
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
