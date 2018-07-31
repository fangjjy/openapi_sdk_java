package com.fang.openapi.dto.photo;

import com.fang.openapi.consts.HouseType;

/**
 * 删除房源图片接口
 *
 * @author wjs
 * @version v1.0.0
 * @create: 2018-07-26 10:57
 * @see <a
 * href="https://github.com/fangjjy/openapi_document/wiki/%E5%88%A0%E9%99%A4%E6%88%BF%E6%BA%90%E5%9B%BE%E7%89%87%E6%8E%A5%E5%8F%A3"
 * target="_blank">参考文档</a>
 * @see HousePhotoDeleteDTO
 */
public class HousePhotoDeleteDTO {

    /**
     * 房源类型 售:Sale; 租:Lease
     * {@link HouseType}
     */
    private String houseType;
    /**
     * 房源id
     */
    private Integer houseid;
    /**
     * 图片id(例如1001,1002,1003)
     */
    private String photoids;

    public String getHouseType() {
        return houseType;
    }

    /**
     * @param houseType 房源类型 售:Sale; 租:Lease {@link HouseType}
     */
    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public Integer getHouseid() {
        return houseid;
    }

    /**
     * @param houseid 房源id
     */
    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public String getPhotoids() {
        return photoids;
    }

    /**
     * @param photoids 图片id(例如1001,1002,1003)
     */
    public void setPhotoids(String photoids) {
        this.photoids = photoids;
    }
}
