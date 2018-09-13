package com.fang.openapi.dto.house;

import com.fang.openapi.consts.HouseType;
import com.fang.openapi.consts.QueryPType;
import com.fang.openapi.util.StringHelper;

/**
 * 房源查询DTO
 *
 * @version 1.0.0
 * @author: Songle
 * @create: 2018-07-25 13:54
 **/
public class HouseQueryDTO {
    public HouseQueryDTO() {
        this.houseType = HouseType.SALE;
        this.houseStatus = null;
        this.houseId = null;
        this.curPage = 1;
        this.pageSize = 20;
        this.queryPType = QueryPType.ALL;
    }

    private String houseType;
    private String purposeType;
    private Integer houseStatus;
    private Integer houseId;
    private String innerId;
    private String projName;
    private Integer curPage;
    private Integer pageSize;
    private Integer queryPType;

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getPurposeType() {
        return purposeType;
    }

    public void setPurposeType(String purposeType) {
        this.purposeType = purposeType;
    }

    public Integer getHouseStatus() {
        return houseStatus;
    }

    public void setHouseStatus(Integer houseStatus) {
        this.houseStatus = houseStatus;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getInnerId() {
        return innerId;
    }

    public void setInnerId(String innerId) {
        this.innerId = innerId;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getQueryPType() {
        return queryPType;
    }

    /**
     * <see>QueryPType</see>
     *
     * @param queryPType
     */
    public void setQueryPType(Integer queryPType) {
        this.queryPType = queryPType;
    }

    @Override
    public String toString() {
        return "HouseQueryDTO{" +
                "houseType='" + houseType + '\'' +
                ", purposeType='" + purposeType + '\'' +
                ", houseStatus=" + houseStatus +
                ", houseId=" + houseId +
                ", innerId=" + innerId +
                ", projName='" + projName + '\'' +
                ", curPage=" + curPage +
                ", pageSize=" + pageSize +
                ", ptype=" + queryPType +
                '}';
    }

    public String formatQuery() {
        if (StringHelper.isNullOrEmpty(houseType)) {
            throw new IllegalArgumentException("错误的租售类型");
        }
        return
                "housetype=" + houseType +
                        "&purposetype=" + validObj(purposeType) +
                        "&houseStatus=" + validObj(houseStatus) +
                        "&houseid=" + validObj(houseId) +
                        "&innerid=" + validObj(innerId) +
                        "&projname=" + validObj(projName) +
                        "&curpage=" + curPage +
                        "&pagesize=" + pageSize +
                        "&ptype=" + validObj(queryPType);
    }

    private String validObj(Object obj) {
        if (obj == null) return "";
        else return obj.toString();
    }
}
