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
}
