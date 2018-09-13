package com.fang.openapi.dto.agentpower;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 用户权限信息
 * @see <a
 *      href="https://github.com/fangjjy/openapi_document/wiki" target="_blank">参考文档</a>
 * @see AgentPowerInfo
 * @author zhangzhiwei
 * @version v2.3.0
 * @create: 2018-08-14 9:13
 */
public class AgentPowerInfo {
    /**
     * 最大可推广房源量
     */
    @JsonProperty("housemax")
    private Integer houseMax;
    /**
     * 已推广房源量
     */
    @JsonProperty("houseusecount")
    private Integer houseUseCount;
    /**
     * 套餐版本
     */
    @JsonProperty("productversion")
    private Integer productVersion;
    /**
     * 产品类型（说明：2 搜房帮； 4 品牌公寓； 8 租房帮； 16 商铺帮； 32 办公帮）
     */
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
