package com.fang.openapi.dto.house;


import com.fang.openapi.dto.photo.HousePhotoDTO;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.LinkedList;
import java.util.List;

/**
 * 出售房源DTO
 *
 * @version 1.0.0
 * @author: 宋乐
 * @create: 2018-05-08
 **/
@JsonTypeName("住宅")
public class HouseSaleDTO extends SaleHouseAbstractDTO {
    public HouseSaleDTO() {
        this.setPurposeType("House");
        this.image1 = new LinkedList <>();
        this.image2 = new LinkedList <>();
        this.image3 = new LinkedList <>();
    }

    /***
     * 类别，来自与客服后台的录入
     */
    private String propertySubType;
    /**
     * 室
     */
    private Short room;
    /**
     * 厅
     */
    private Short hall;
    /**
     * 卫生间
     */
    private Short toilet;
    /**
     * 厨房
     */
    private Short kitchen;
    /**
     * 阳台
     */
    private Short balcony;

    /**
     * 所在楼层
     */
    private Short floor;
    /**
     * 产权性质
     */
    private String payInfo;
    /**
     * 使用面积
     */
    private Double liveArea;
    /**
     * 建筑年代
     */
    private String createTime;
    /**
     * 朝向
     */
    private String forward;
    /**
     * 装修程度
     */
    private String fitment;
    /**
     * 配套设施
     */
    private String baseService;
    /**
     * 看房时间类别
     */
    private String lookHouse;

    /**
     * 房源标签
     */
    private String feature;
    /**
     * 建筑结构
     */
    private String houseStructure;
    /**
     * 建筑形式
     */
    private String buildingType;
    /**
     * 社（小）区配套（只有住宅别墅有，其他物业类型留备）
     */
    private String communitymatching;
    /**
     * 服务介绍（只有住宅别墅有，其他物业类型留备）
     */
    private String serviceintroduction;
    /**
     * 业主心态（只有住宅别墅有，其他物业类型留备）
     */
    private String ownermentality;
    /**
     * 税费分析（只有住宅别墅有，其他物业类型留备）
     */

    private String taxanalysis;

    /**
     * 室内图
     */
    private List<HousePhotoDTO> image1;
    /***
     * 小区图
     */
    private List <HousePhotoDTO> image2;
    /***
     * 户型图
     */
    private List <HousePhotoDTO> image3;


    public String getPropertySubType() {
        return propertySubType;
    }

    public void setPropertySubType(String propertySubType) {
        this.propertySubType = propertySubType;
    }

    public Short getRoom() {
        return room;
    }

    public void setRoom(Short room) {
        this.room = room;
    }

    public Short getHall() {
        return hall;
    }

    public void setHall(Short hall) {
        this.hall = hall;
    }

    public Short getToilet() {
        return toilet;
    }

    public void setToilet(Short toilet) {
        this.toilet = toilet;
    }

    public Short getKitchen() {
        return kitchen;
    }

    public void setKitchen(Short kitchen) {
        this.kitchen = kitchen;
    }

    public Short getBalcony() {
        return balcony;
    }

    public void setBalcony(Short balcony) {
        this.balcony = balcony;
    }


    public Short getFloor() {
        return floor;
    }

    public void setFloor(Short floor) {
        this.floor = floor;
    }

    public String getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(String payInfo) {
        this.payInfo = payInfo;
    }

    public Double getLiveArea() {
        return liveArea;
    }

    public void setLiveArea(Double liveArea) {
        this.liveArea = liveArea;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getForward() {
        return forward;
    }

    public void setForward(String forward) {
        this.forward = forward;
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

    public String getLookHouse() {
        return lookHouse;
    }

    public void setLookHouse(String lookHouse) {
        this.lookHouse = lookHouse;
    }


    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getHouseStructure() {
        return houseStructure;
    }

    public void setHouseStructure(String houseStructure) {
        this.houseStructure = houseStructure;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public List <HousePhotoDTO> getImage1() {
        return image1;
    }

    public List <HousePhotoDTO> getImage2() {
        return image2;
    }


    public List <HousePhotoDTO> getImage3() {
        return image3;
    }

    public String getCommunitymatching() {
        return communitymatching;
    }

    public void setCommunitymatching(String communitymatching) {
        this.communitymatching = communitymatching;
    }

    public String getServiceintroduction() {
        return serviceintroduction;
    }

    public void setServiceintroduction(String serviceintroduction) {
        this.serviceintroduction = serviceintroduction;
    }

    public String getOwnermentality() {
        return ownermentality;
    }

    public void setOwnermentality(String ownermentality) {
        this.ownermentality = ownermentality;
    }

    public String getTaxanalysis() {
        return taxanalysis;
    }

    public void setTaxanalysis(String taxanalysis) {
        this.taxanalysis = taxanalysis;
    }
}
