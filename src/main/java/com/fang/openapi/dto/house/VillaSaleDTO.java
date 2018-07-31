package com.fang.openapi.dto.house;


import com.fang.openapi.dto.photo.HousePhotoDTO;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.LinkedList;
import java.util.List;

/**
 * 出售别墅DTO
 *
 * @version 1.0.0
 * @author: Songle
 * @create: 2018-06-11 09:29
 **/
@JsonTypeName("别墅")
public class VillaSaleDTO extends SaleHouseAbstractDTO {
    public VillaSaleDTO() {
        this.setPurposeType("Villa");
        this.image1 = new LinkedList <>();
        this.image2 = new LinkedList <>();
        this.image3 = new LinkedList <>();
    }

    /**
     * 建筑形式
     */
    private String buildingType;
    /**
     * PayInfo
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
     * 厅结构
     */
    private String houseStructure;
    /**
     * 地下室类型
     */
    private String shopType;
    /**
     * 花园面积（如果有）
     */
    private Double spaceArea;
    /**
     * 车库数量
     */
    private Integer garage;
    /**
     * 车位数量（如果有）
     */
    private Integer parkingPlace;
    /**
     * 使用面积
     */
    private Double liveArea;
    /**
     * 建筑年代
     */
    private String createTime;
    /**
     * 进门朝向
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
     * 看房时间
     */
    private String lookHouse;

    /**
     * 房源标签
     */
    private String feature;
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
     * 地下室面积
     */
    private Double workshopArea;
    /**
     * 室内图
     */
    private List <HousePhotoDTO> image1;
    /***
     * 小区图
     */
    private List <HousePhotoDTO> image2;
    /***
     * 户型图
     */
    private List <HousePhotoDTO> image3;

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
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

    public String getHouseStructure() {
        return houseStructure;
    }

    public void setHouseStructure(String houseStructure) {
        this.houseStructure = houseStructure;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public Double getSpaceArea() {
        return spaceArea;
    }

    public void setSpaceArea(Double spaceArea) {
        this.spaceArea = spaceArea;
    }

    public Integer getGarage() {
        return garage;
    }

    public void setGarage(Integer garage) {
        this.garage = garage;
    }

    public Integer getParkingPlace() {
        return parkingPlace;
    }

    public void setParkingPlace(Integer parkingPlace) {
        this.parkingPlace = parkingPlace;
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

    public void setLookHouse(String lookHouseType) {
        this.lookHouse = lookHouseType;
    }


    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
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

    public Double getWorkshopArea() {
        return workshopArea;
    }

    public void setWorkshopArea(Double workshopArea) {
        this.workshopArea = workshopArea;
    }
}
