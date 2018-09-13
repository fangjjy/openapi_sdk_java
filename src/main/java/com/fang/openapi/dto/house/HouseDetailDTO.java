package com.fang.openapi.dto.house;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 房源详细信息对象,用于查询房源详情接口
 *
 * @author songle
 * @version 1.0.0
 * @create: 2018-07-26 10:57
 */
public class HouseDetailDTO {
    /**
     * 房源id
     */

    @JsonProperty("houseid")
    private Integer houseId;
    /**
     * 经纪人id
     */
    @JsonProperty("agentid")
    private Integer agentId;
    /**
     * 房源标题
     */
    @JsonProperty("boardtitle")
    private String boardTitle;
    /**
     * 房源描述
     */
    @JsonProperty("boardcontent")
    private String boardContent;
    /**
     * 周边配套
     */
    @JsonProperty("subwayinfo")
    private String subWayInfo;
    /**
     * 交通状况
     */
    @JsonProperty("trafficinfo")
    private String trafficInfo;
    /**
     * 业主心态
     */
    private String ownerMentality;
    /**
     * 社区配套
     */
    private String communityMatching;
    /**
     * 服务介绍
     */
    private String serviceIntroduction;
    /**
     * 税费分析
     */
    private String taxAnalysis;
    /**
     * 户型介绍 出租住宅、别墅
     */
    private String houseTypeIntroduction;

    /**
     * 视频标题
     */
    @JsonProperty("videotilte")
    private String videoTilte;
    /**
     * 视频URL
     */
    @JsonProperty("videourl")
    private String VideoURL;
    /**
     * 房管局房源二维码地址
     */
    private String qrimgurl;
    /**
     * 城市
     */
    private String city;
    /**
     * 是否推广到了新搜房帮
     */
    private String isPubWsfb;
    /**
     * 是否推广到了商铺帮
     */
    private String isPubShop;
    /**
     * 是否推广到办公帮
     */
    private String isPubOffice;
    private String floor;
    /**
     * 总楼层数
     */
    @JsonProperty("totalfloor")
    private String totalFloor;
    /**
     * 使用面积
     */
    @JsonProperty("liveArea")
    private String livearea;
    /**
     * 朝向
     */
    private String forward;
    /**
     * 建筑年代
     */
    @JsonProperty("createtime")
    private String createTime;
    /**
     * 基础设施
     */
    @JsonProperty("baseService")
    private String baseservice;
    /**
     * 装修程度
     */
    private String fitment;
    /**
     * 看房时间
     */
    @JsonProperty("lookhousetype")
    private String lookHouseType;
    /**
     * 住宅类型
     */
    @JsonProperty("propertysubtype")
    private String propertySubType;
    private String room;
    private String hall;
    private String toilet;
    private String kitchen;
    private String balcony;
    /**
     * 地下室面积
     */
    @JsonProperty("workshoparea")
    private String workshopArea;
    /**
     * 花园面积 别墅
     */
    @JsonProperty("spacearea")
    private String spaceArea;
    /**
     * 车库数量 （别墅）
     */
    private String garage;
    /**
     * 车位数量（别墅）
     */
    @JsonProperty("parkingplace")
    private String parkingPlace;
    /**
     * 铺面类型（商铺）或地下室类型（别墅）
     */
    @JsonProperty("shoptype")
    private String shopType;
    /**
     * 物业费
     */
    @JsonProperty("propertyfee")
    private String propertyFee;
    /**
     * 物业公司(商铺、写字楼)
     */
    @JsonProperty("propertyCompany")
    private String propertycompany;
    /**
     * 目标业态(商铺)
     */
    @JsonProperty("aimOperastion")
    private String aimoperastion;
    /**
     * 物业级别(写字楼)
     */
    @JsonProperty("propertyGrade")
    private String propertygrade;
    /**
     * 建筑类别 独栋 双拼 联排 叠加	别墅、出售住宅
     */
    @JsonProperty("buildingtype")
    private String buildingType;
    /**
     * 厅结构：平层 挑高	别墅、住宅、厂房
     */
    @JsonProperty("housetructure")
    private String houseStructure;
    private String tag;
    private String status;
    @JsonProperty("isvalid")
    private String isValid;
    private String source;

    private String district;
    private String comarea;
    private String address;
    private String purpose;
    private String projcode;
    private String projname;
    /**
     * 建筑面积
     */
    @JsonProperty("buildingarea")
    private String buildingArea;
    /**
     * 价格
     */
    private String price;
    /**
     * 价格单位
     */
    @JsonProperty("pricetype")
    private String priceType;
    /**
     * 内部房源编号
     */
    @JsonProperty("innerId")
    private String innerid;
    /**
     * 房源封面图
     */
    @JsonProperty("photourl")
    private String photoURL;
    /**
     * 特色分类
     */
    private String feature;
    /**
     * 房源信息编码
     */
    @JsonProperty("infocode")
    private String infoCode;
    /**
     * 录入时间
     */
    @JsonProperty("insertTime")
    private String inserttime;
    /**
     * 修改时间
     */
    @JsonProperty("modifydate")
    private String modifyDate;
    /**
     * 是否有视频
     */
    @JsonProperty("isvideo")
    private String isVideo;
    /**
     * 房源图片数量
     */
    @JsonProperty("imagecount")
    private String imageCount;
    /**
     * 是否优质房源
     */
    @JsonProperty("isbest")
    private String isBest;
    /**
     * 房源推广状态
     */
    @JsonProperty("PromoteProductType")
    private String promoteProductType;
    /**
     * 房源点击付费状态
     */
    @JsonProperty("ClickListingStatus")
    private String clickListingStatus;

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public String getSubWayInfo() {
        return subWayInfo;
    }

    public void setSubWayInfo(String subWayInfo) {
        this.subWayInfo = subWayInfo;
    }

    public String getTrafficInfo() {
        return trafficInfo;
    }

    public void setTrafficInfo(String trafficInfo) {
        this.trafficInfo = trafficInfo;
    }

    public String getOwnerMentality() {
        return ownerMentality;
    }

    public void setOwnerMentality(String ownerMentality) {
        this.ownerMentality = ownerMentality;
    }

    public String getCommunityMatching() {
        return communityMatching;
    }

    public void setCommunityMatching(String communityMatching) {
        this.communityMatching = communityMatching;
    }

    public String getServiceIntroduction() {
        return serviceIntroduction;
    }

    public void setServiceIntroduction(String serviceIntroduction) {
        this.serviceIntroduction = serviceIntroduction;
    }

    public String getTaxAnalysis() {
        return taxAnalysis;
    }

    public void setTaxAnalysis(String taxAnalysis) {
        this.taxAnalysis = taxAnalysis;
    }

    public String getHouseTypeIntroduction() {
        return houseTypeIntroduction;
    }

    public void setHouseTypeIntroduction(String houseTypeIntroduction) {
        this.houseTypeIntroduction = houseTypeIntroduction;
    }

    public String getVideoTilte() {
        return videoTilte;
    }

    public void setVideoTilte(String videoTilte) {
        this.videoTilte = videoTilte;
    }

    public String getVideoURL() {
        return VideoURL;
    }

    public void setVideoURL(String videoURL) {
        VideoURL = videoURL;
    }

    public String getQrimgurl() {
        return qrimgurl;
    }

    public void setQrimgurl(String qrimgurl) {
        this.qrimgurl = qrimgurl;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIsPubWsfb() {
        return isPubWsfb;
    }

    public void setIsPubWsfb(String isPubWsfb) {
        this.isPubWsfb = isPubWsfb;
    }

    public String getIsPubShop() {
        return isPubShop;
    }

    public void setIsPubShop(String isPubShop) {
        this.isPubShop = isPubShop;
    }

    public String getIsPubOffice() {
        return isPubOffice;
    }

    public void setIsPubOffice(String isPubOffice) {
        this.isPubOffice = isPubOffice;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(String totalFloor) {
        this.totalFloor = totalFloor;
    }

    public String getLivearea() {
        return livearea;
    }

    public void setLivearea(String livearea) {
        this.livearea = livearea;
    }

    public String getForward() {
        return forward;
    }

    public void setForward(String forward) {
        this.forward = forward;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getBaseservice() {
        return baseservice;
    }

    public void setBaseservice(String baseservice) {
        this.baseservice = baseservice;
    }

    public String getFitment() {
        return fitment;
    }

    public void setFitment(String fitment) {
        this.fitment = fitment;
    }

    public String getLookHouseType() {
        return lookHouseType;
    }

    public void setLookHouseType(String lookHouseType) {
        this.lookHouseType = lookHouseType;
    }

    public String getPropertySubType() {
        return propertySubType;
    }

    public void setPropertySubType(String propertySubType) {
        this.propertySubType = propertySubType;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public String getToilet() {
        return toilet;
    }

    public void setToilet(String toilet) {
        this.toilet = toilet;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getBalcony() {
        return balcony;
    }

    public void setBalcony(String balcony) {
        this.balcony = balcony;
    }

    public String getWorkshopArea() {
        return workshopArea;
    }

    public void setWorkshopArea(String workshopArea) {
        this.workshopArea = workshopArea;
    }

    public String getSpaceArea() {
        return spaceArea;
    }

    public void setSpaceArea(String spaceArea) {
        this.spaceArea = spaceArea;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public String getParkingPlace() {
        return parkingPlace;
    }

    public void setParkingPlace(String parkingPlace) {
        this.parkingPlace = parkingPlace;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getPropertyFee() {
        return propertyFee;
    }

    public void setPropertyFee(String propertyFee) {
        this.propertyFee = propertyFee;
    }

    public String getPropertycompany() {
        return propertycompany;
    }

    public void setPropertycompany(String propertycompany) {
        this.propertycompany = propertycompany;
    }

    public String getAimoperastion() {
        return aimoperastion;
    }

    public void setAimoperastion(String aimoperastion) {
        this.aimoperastion = aimoperastion;
    }

    public String getPropertygrade() {
        return propertygrade;
    }

    public void setPropertygrade(String propertygrade) {
        this.propertygrade = propertygrade;
    }

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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getComarea() {
        return comarea;
    }

    public void setComarea(String comarea) {
        this.comarea = comarea;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getProjcode() {
        return projcode;
    }

    public void setProjcode(String projcode) {
        this.projcode = projcode;
    }

    public String getProjname() {
        return projname;
    }

    public void setProjname(String projname) {
        this.projname = projname;
    }

    public String getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(String buildingArea) {
        this.buildingArea = buildingArea;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public String getInnerid() {
        return innerid;
    }

    public void setInnerid(String innerid) {
        this.innerid = innerid;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getInfoCode() {
        return infoCode;
    }

    public void setInfoCode(String infoCode) {
        this.infoCode = infoCode;
    }

    public String getInserttime() {
        return inserttime;
    }

    public void setInserttime(String inserttime) {
        this.inserttime = inserttime;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getIsVideo() {
        return isVideo;
    }

    public void setIsVideo(String isVideo) {
        this.isVideo = isVideo;
    }

    public String getImageCount() {
        return imageCount;
    }

    public void setImageCount(String imageCount) {
        this.imageCount = imageCount;
    }

    public String getIsBest() {
        return isBest;
    }

    public void setIsBest(String isBest) {
        this.isBest = isBest;
    }

    public String getPromoteProductType() {
        return promoteProductType;
    }

    public void setPromoteProductType(String promoteProductType) {
        this.promoteProductType = promoteProductType;
    }

    public String getClickListingStatus() {
        return clickListingStatus;
    }

    public void setClickListingStatus(String clickListingStatus) {
        this.clickListingStatus = clickListingStatus;
    }
}
