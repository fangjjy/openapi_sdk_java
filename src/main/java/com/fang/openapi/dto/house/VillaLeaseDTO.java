package com.fang.openapi.dto.house;

import com.fang.openapi.dto.photo.HousePhotoDTO;

import java.util.LinkedList;
import java.util.List;

/**
 * 别墅出租DTO
 *
 * @version 1.0.0
 * @author: Songle
 * @create: 2018-06-11 10:30
 **/
public class VillaLeaseDTO extends LeaseHouseAbstractDTO {
    public VillaLeaseDTO() {
        this.setPurposeType("Villa");
        this.image1 = new LinkedList <>();
        this.image2 = new LinkedList <>();
        this.image3 = new LinkedList <>();
    }

    /**
     * 建筑形式:
     * 独栋
     * 双拼
     * 联排
     * 叠加
     */
    private String buildingType;
    /**
     * 厅结构 平层\挑高
     */
    private String houseStructure;
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
     * 出租方式：整租；合租
     */
    private String LeaseStyle;
    /**
     * 支付方式(押一付三。年付等)
     */
    private String payDetail;
    /**
     * 建筑年代
     */
    private String createTime;
    /**
     * 使用面积
     */
    private Double liveArea;

    /**
     * 进门朝向
     */
    private String forward;
    /**
     * 地下室类型:     全明     半明     暗
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
     * 装修程度
     */
    private String fitment;
    /**
     * 配套设施
     */
    private String baseService;
    /**
     * 室内设施
     */
    private String equitment;
    /**
     * 看房时间
     */
    private String lookHouse;
    /**
     * 入住时间
     */
    private String liveTime;

    /**
     * 社（小）区配套（只有住宅别墅有，其他物业类型留备）
     */
    private String communitymatching;
    /**
     * 服务介绍（只有住宅别墅有，其他物业类型留备）
     */
    private String serviceintroduction;
    /**
     * 户型介绍（只有住宅别墅暂时有用）
     */
    private String housetypeintroduction;
    /**
     * 周边配套（只有住宅别墅有，其他物业类型留备）
     */
    private String subwayinfo;
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

    public String getHouseStructure() {
        return houseStructure;
    }

    public void setHouseStructure(String houseStructure) {
        this.houseStructure = houseStructure;
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

    public String getLeaseStyle() {
        return LeaseStyle;
    }

    public void setLeaseStyle(String leaseStyle) {
        LeaseStyle = leaseStyle;
    }

    public String getPayDetail() {
        return payDetail;
    }

    public void setPayDetail(String payDetail) {
        this.payDetail = payDetail;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Double getLiveArea() {
        return liveArea;
    }

    public void setLiveArea(Double liveArea) {
        this.liveArea = liveArea;
    }

    public String getForward() {
        return forward;
    }

    public void setForward(String forward) {
        this.forward = forward;
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

    public String getEquitment() {
        return equitment;
    }

    public void setEquitment(String equitment) {
        this.equitment = equitment;
    }

    public String getLookHouse() {
        return lookHouse;
    }

    public void setLookHouse(String lookHouse) {
        this.lookHouse = lookHouse;
    }

    public String getLiveTime() {
        return liveTime;
    }

    public void setLiveTime(String liveTime) {
        this.liveTime = liveTime;
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

    public String getHousetypeintroduction() {
        return housetypeintroduction;
    }

    public void setHousetypeintroduction(String housetypeintroduction) {
        this.housetypeintroduction = housetypeintroduction;
    }

    public Double getWorkshopArea() {
        return workshopArea;
    }

    public void setWorkshopArea(Double workshopArea) {
        this.workshopArea = workshopArea;
    }

    public String getSubwayinfo() {
        return subwayinfo;
    }

    public void setSubwayinfo(String subwayinfo) {
        this.subwayinfo = subwayinfo;
    }
}
