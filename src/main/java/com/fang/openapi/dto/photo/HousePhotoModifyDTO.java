package com.fang.openapi.dto.photo;

import com.fang.openapi.consts.HouseType;

/**
 * 房源详细信息对象
 * 注意：Photoids和Photonames是一一相对应修改的
 *
 * @author wjs
 * @version v1.0.0
 * @create: 2018-07-26 10:57
 * @see <a
 * href="https://github.com/fangjjy/openapi_document/wiki/%E4%BF%AE%E6%94%B9%E6%88%BF%E6%BA%90%E5%9B%BE%E7%89%87%E5%90%8D%E7%A7%B0"
 * target="_blank">参考文档</a>
 * @see HousePhotoModifyDTO
 */
public class HousePhotoModifyDTO {

    /**
     * 房源类型 售:Sale; 租:Lease
     * {@link HouseType}
     */
    private String houseType;
    /**
     * 房源id 如 1003
     */
    private Integer houseid;
    /**
     * 图片名称 如:  photoname1, photoname2, photoname3
     */
    private String photonames;
    /**
     * 图片id   如:1001,1002,1003
     */
    private String photoids;


    public String getHouseType() {
        return houseType;
    }

    /**
     *
     * @param houseType 房源类型 售:Sale; 租:Lease {@link HouseType}
     */
    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public Integer getHouseid() {
        return houseid;
    }

    /**
     *
     * @param houseid 房源id 如 1003
     */
    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public String getPhotonames() {
        return photonames;
    }

    /**
     *
     * @param photonames 图片名称 如:  photoname1, photoname2, photoname3
     */
    public void setPhotonames(String photonames) {
        this.photonames = photonames;
    }

    public String getPhotoids() {
        return photoids;
    }

    /**
     *
     * @param photoids 图片id   如:1001,1002,1003
     */
    public void setPhotoids(String photoids) {
        this.photoids = photoids;
    }
}
