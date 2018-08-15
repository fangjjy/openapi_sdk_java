package com.fang.openapi.dto.agentpower;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @description: 用户权限信息
 * @author: zhiwe
 * @create: 2018-08-14 9:13
 **/
public class AgentPowerInfo {
    @JsonProperty("housemax")
    private Integer houseMax;
    @JsonProperty("houseusecount")
    private Integer houseUseCount;
    @JsonProperty("productversion")
    private Integer productVersion;
    @JsonProperty("producttype")
    private Integer productType;

    public Integer getHousemax() {
        return houseMax;
    }

    public void setHousemax(Integer housemax) {
        this.houseMax = housemax;
    }

    public Integer getHouseUseCount() {
        return houseUseCount;
    }

    public void setHouseUseCount(Integer houseUseCount) {
        this.houseUseCount = houseUseCount;
    }

    public Integer getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(Integer productVersion) {
        this.productVersion = productVersion;
    }

    public Integer getProducttype() {
        return productType;
    }

    public void setProducttype(Integer producttype) {
        this.productType = producttype;
    }
}
