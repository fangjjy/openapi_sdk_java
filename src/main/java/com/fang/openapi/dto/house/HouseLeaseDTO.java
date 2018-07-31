package com.fang.openapi.dto.house;

import com.fang.openapi.dto.photo.HousePhotoDTO;

import java.util.LinkedList;
import java.util.List;

/**
 * 出租房源DTO
 *
 * @version 1.0.0
 * @author: Songle
 * @create: 2018-06-08 15:27
 **/
public class HouseLeaseDTO extends LeaseHouseAbstractDTO {
    public HouseLeaseDTO() {
        this.setPurposeType("House");
        this.image1 = new LinkedList <>();
        this.image2 = new LinkedList <>();
        this.image3 = new LinkedList <>();
    }

    /**
     * 卧室
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
     * 支付方式(押一付三。年付等)
     */

    private String payDetail;
    /**
     * 朝向
     */

    private String forward;
    /**
     * 装修程度
     */

    private String fitment;
    /**
     * 出租方式：整租；合租
     */

    private String LeaseStyle;
    /**
     * 合租户数
     */
    private Short roommateCount;
    /**
     * 合住方式：主卧、次卧、床位、隔断间
     */
    private String leaseroomtype;
    /**
     * 合租限制 ：性别不限、限女生、限男生、限夫妻
     */
    private String leasedetail;
    /**
     * 配套设施
     */

    private String baseService;
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
     * 户型介绍（只有住宅别墅暂时有用）
     */
    private String housetypeintroduction;
    /**
     * 周边配套（只有住宅别墅有，其他物业类型留备）
     */
    private String subwayinfo;
    /**
     * 看房时间
     */
    private String lookHouse;
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

    public String getPayDetail() {
        return payDetail;
    }

    public void setPayDetail(String payDetail) {
        this.payDetail = payDetail;
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

    public String getLeaseStyle() {
        return LeaseStyle;
    }

    public void setLeaseStyle(String leaseStyle) {
        LeaseStyle = leaseStyle;
    }

    public Short getRoommateCount() {
        return roommateCount;
    }

    public void setRoommateCount(Short roommateCount) {
        this.roommateCount = roommateCount;
    }

    public String getLeaseroomtype() {
        return leaseroomtype;
    }

    public void setLeaseroomtype(String leaseroomtype) {
        this.leaseroomtype = leaseroomtype;
    }

    public String getLeasedetail() {
        return leasedetail;
    }

    public void setLeasedetail(String leasedetail) {
        this.leasedetail = leasedetail;
    }

    public String getBaseService() {
        return baseService;
    }

    public void setBaseService(String baseService) {
        this.baseService = baseService;
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

    public String getHousetypeintroduction() {
        return housetypeintroduction;
    }

    public void setHousetypeintroduction(String housetypeintroduction) {
        this.housetypeintroduction = housetypeintroduction;
    }

    public String getSubwayinfo() {
        return subwayinfo;
    }

    public void setSubwayinfo(String subwayinfo) {
        this.subwayinfo = subwayinfo;
    }

    public String getLookHouse() {
        return lookHouse;
    }

    public void setLookHouse(String lookHouse) {
        this.lookHouse = lookHouse;
    }
}
