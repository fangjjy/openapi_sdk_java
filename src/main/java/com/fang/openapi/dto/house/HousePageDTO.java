package com.fang.openapi.dto.house;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

/**
 * 房源列表返回DTO
 *
 * @version 1.0.0
 * @author: Songle
 * @create: 2018-07-25 15:58
 **/
public class HousePageDTO {
    /**
     * 违规房源
     */
    private Integer violationcount;
    /**
     * 过期房源数
     */
    private Integer overduecount;
    /**
     * 查询房源数
     */
    private Integer housecount;
    /**
     * 房源列表
     */
    private List <HousePageDetailDTO> list;

    public Integer getViolationcount() {
        return violationcount;
    }

    public void setViolationcount(Integer violationcount) {
        this.violationcount = violationcount;
    }

    public Integer getOverduecount() {
        return overduecount;
    }

    public void setOverduecount(Integer overduecount) {
        this.overduecount = overduecount;
    }

    public Integer getHousecount() {
        return housecount;
    }

    public void setHousecount(Integer housecount) {
        this.housecount = housecount;
    }

    public List <HousePageDetailDTO> getList() {
        return list;
    }

    public void setList(List <HousePageDetailDTO> list) {
        this.list = list;
    }

    public static class HousePageDetailDTO {
        @JsonProperty("houseid")
        private Integer houseId;
        @JsonProperty("agentid")
        private Integer agentId;
        @JsonProperty("agentname")
        private String agentName;
        @JsonProperty("registdate")
        private Date registDate;
        @JsonProperty("imagecount")
        private Integer imageCount;
        @JsonProperty("isvideo")
        private Integer isVideo;
        private String address;
        private Short room;
        private Short hall;
        private Short toilet;
        @JsonProperty("buildingarea")
        private Float buildingArea;
        private Float price;
        @JsonProperty("pricetype")
        private String priceType;
        @JsonProperty("isbest")
        private Short isbBest;
        /**
         * 房源是否过期2:为过期;3:已过期
         */
        private Short status;
        @JsonProperty("Source")
        private String source;
        @JsonProperty("projname")
        private String projName;
        @JsonProperty("projCode")
        private Long projCode;
        @JsonProperty("limitdate")
        private Integer limitDate;
        private Short tag;
        @JsonProperty("inserttime")
        private Date insertTime;
        @JsonProperty("isvalid")
        private Short isValid;
        private Short abnormal;
        @JsonProperty("Purpose")
        private String purpose;
        @JsonProperty("boardtitle")
        private String title;
        @JsonProperty("photourl")
        private String photoURL;
        @JsonProperty("promoteproducttype")
        private Integer promoteProductType;
        @JsonProperty("promotedto")
        private List <Integer> promotedTo;
        /**
         * 出租
         */
        private Integer showlevel;

        private Date tagaddtime;

        private Short isRealHouse;
        private Short isNewHouse;
        @JsonProperty("Deposit")
        private Short deposit;

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

        public String getAgentName() {
            return agentName;
        }

        public void setAgentName(String agentName) {
            this.agentName = agentName;
        }

        public Date getRegistDate() {
            return registDate;
        }

        public void setRegistDate(Date registDate) {
            this.registDate = registDate;
        }

        public Integer getImageCount() {
            return imageCount;
        }

        public void setImageCount(Integer imageCount) {
            this.imageCount = imageCount;
        }

        public Integer getIsVideo() {
            return isVideo;
        }

        public void setIsVideo(Integer isVideo) {
            this.isVideo = isVideo;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
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

        public Float getBuildingArea() {
            return buildingArea;
        }

        public void setBuildingArea(Float buildingArea) {
            this.buildingArea = buildingArea;
        }

        public Float getPrice() {
            return price;
        }

        public void setPrice(Float price) {
            this.price = price;
        }

        public String getPriceType() {
            return priceType;
        }

        public void setPriceType(String priceType) {
            this.priceType = priceType;
        }

        public Short getIsbBest() {
            return isbBest;
        }

        public void setIsbBest(Short isbBest) {
            this.isbBest = isbBest;
        }

        public Short getStatus() {
            return status;
        }

        public void setStatus(Short status) {
            this.status = status;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getProjName() {
            return projName;
        }

        public void setProjName(String projName) {
            this.projName = projName;
        }

        public Long getProjCode() {
            return projCode;
        }

        public void setProjCode(Long projCode) {
            this.projCode = projCode;
        }

        public Integer getLimitDate() {
            return limitDate;
        }

        public void setLimitDate(Integer limitDate) {
            this.limitDate = limitDate;
        }

        public Short getTag() {
            return tag;
        }

        public void setTag(Short tag) {
            this.tag = tag;
        }

        public Date getInsertTime() {
            return insertTime;
        }

        public void setInsertTime(Date insertTime) {
            this.insertTime = insertTime;
        }

        public Short getIsValid() {
            return isValid;
        }

        public void setIsValid(Short isValid) {
            this.isValid = isValid;
        }

        public Short getAbnormal() {
            return abnormal;
        }

        public void setAbnormal(Short abnormal) {
            this.abnormal = abnormal;
        }

        public String getPurpose() {
            return purpose;
        }

        public void setPurpose(String purpose) {
            this.purpose = purpose;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPhotoURL() {
            return photoURL;
        }

        public void setPhotoURL(String photoURL) {
            this.photoURL = photoURL;
        }

        public Integer getPromoteProductType() {
            return promoteProductType;
        }

        public void setPromoteProductType(Integer promoteProductType) {
            this.promoteProductType = promoteProductType;
        }

        public List <Integer> getPromotedTo() {
            return promotedTo;
        }

        public void setPromotedTo(List <Integer> promotedTo) {
            this.promotedTo = promotedTo;
        }

        public Integer getShowlevel() {
            return showlevel;
        }

        public void setShowlevel(Integer showlevel) {
            this.showlevel = showlevel;
        }

        public Date getTagaddtime() {
            return tagaddtime;
        }

        public void setTagaddtime(Date tagaddtime) {
            this.tagaddtime = tagaddtime;
        }

        public Short getIsRealHouse() {
            return isRealHouse;
        }

        public void setIsRealHouse(Short isRealHouse) {
            this.isRealHouse = isRealHouse;
        }

        public Short getIsNewHouse() {
            return isNewHouse;
        }

        public void setIsNewHouse(Short isNewHouse) {
            this.isNewHouse = isNewHouse;
        }

        public Short getDeposit() {
            return deposit;
        }

        public void setDeposit(Short deposit) {
            this.deposit = deposit;
        }

        @Override
        public String toString() {
            return "HousePageDetailDTO{" +
                    "houseId=" + houseId +
                    ", agentId=" + agentId +
                    ", agentName='" + agentName + '\'' +
                    ", registDate=" + registDate +
                    ", imageCount=" + imageCount +
                    ", isVideo=" + isVideo +
                    ", address='" + address + '\'' +
                    ", room=" + room +
                    ", hall=" + hall +
                    ", toilet=" + toilet +
                    ", buildingArea=" + buildingArea +
                    ", price=" + price +
                    ", priceType='" + priceType + '\'' +
                    ", isbBest=" + isbBest +
                    ", status=" + status +
                    ", source='" + source + '\'' +
                    ", projName='" + projName + '\'' +
                    ", projCode=" + projCode +
                    ", limitDate=" + limitDate +
                    ", tag=" + tag +
                    ", insertTime=" + insertTime +
                    ", isValid=" + isValid +
                    ", abnormal=" + abnormal +
                    ", purpose='" + purpose + '\'' +
                    ", title='" + title + '\'' +
                    ", photoURL='" + photoURL + '\'' +
                    ", promoteProductType=" + promoteProductType +
                    ", promotedTo=" + promotedTo +
                    ", showlevel=" + showlevel +
                    ", tagaddtime=" + tagaddtime +
                    ", isRealHouse=" + isRealHouse +
                    ", isNewHouse=" + isNewHouse +
                    ", deposit=" + deposit +
                    '}';
        }
    }
}
