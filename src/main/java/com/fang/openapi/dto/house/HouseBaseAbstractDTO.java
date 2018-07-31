package com.fang.openapi.dto.house;


/**
 * 录入房源的所有基础类
 *
 * @version 1.0.0
 * @author: wangliying
 * @create: 2018-05-08
 **/
public abstract class HouseBaseAbstractDTO {
    /**
     * 楼盘字典名称
     */

    private String projName;
    /**
     * 楼盘字典id
     */
    private Long newCode;
    /**
     * 楼盘所在区县
     */

    private String district;
    /**
     * 楼盘所在商圈
     */

    private String comarea;
    /**
     * 物业地址
     */

    private String address;
    /**
     * 物业类型（住宅，别墅、商铺、写字楼）
     */
    private String purposeType;
    /**
     * 价格
     */
    private Double price;
    /**
     * 建筑面积
     */

    private Double buildingArea;
    /**
     * 房源内部编号
     */
    private String innerId;
    /**
     * 标 题 图
     */
    private String PhotoUrl;
    /**
     * 房源信息编码
     */
    private String infoCode;
    /**
     * 总楼层数
     */
    private Short allFloor;

    /**
     * 房源描述
     */
    private String content;

    /**
     * 交通状况
     */
    private String trafficinfo;
    /**
     * 房源标题
     */
    private String title;
    /**
     * 周边配套
     */
    private String subwayInfo;
    /**
     * 视频的地址
     */
    private String videoUrl;
    /**
     * 视频标题
     */
    private String videoTitle;


    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public Long getNewCode() {
        return newCode;
    }

    public void setNewCode(Long newCode) {
        this.newCode = newCode;
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

    public String getPurposeType() {
        return purposeType;
    }

    protected void setPurposeType(String purpose) {
        this.purposeType = purpose;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(Double buildingArea) {
        this.buildingArea = buildingArea;
    }

    public String getInnerId() {
        return innerId;
    }

    public void setInnerId(String innerId) {
        this.innerId = innerId;
    }

    public String getPhotoUrl() {
        return PhotoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        PhotoUrl = photoUrl;
    }

    public String getInfoCode() {
        return infoCode;
    }

    public void setInfoCode(String infoCode) {
        this.infoCode = infoCode;
    }

    public Short getAllFloor() {
        return allFloor;
    }

    public void setAllFloor(Short allFloor) {
        this.allFloor = allFloor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getTrafficinfo() {
        return trafficinfo;
    }

    public void setTrafficinfo(String trafficinfo) {
        this.trafficinfo = trafficinfo;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * 设置视频URL，<B><font color="red">修改房源注意：</font><br/>
     * 1.传入为空时，默认的操作是房源的视频不做任何修改，即使传入的视频的标题，标题也不会修改。<br/>
     * 2.当传入的值为null(是字符串的“null”)，如果有房源视频标识删除房源视频。
     * </B>
     *
     * @param videoUrl
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubwayInfo() {
        return subwayInfo;
    }

    public void setSubwayInfo(String subwayInfo) {
        this.subwayInfo = subwayInfo;
    }
}
