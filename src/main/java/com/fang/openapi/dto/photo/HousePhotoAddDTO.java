package com.fang.openapi.dto.photo;

import com.fang.openapi.consts.HouseType;

/**
 * 上传房源图片接口 输入
 *
 * @author wjs
 * @version v1.0.0
 * @create: 2018-07-26 10:57
 * @see <a href="https://github.com/fangjjy/openapi_document/wiki/%E4%B8%8A%E4%BC%A0%E6%88%BF%E6%BA%90%E5%9B%BE%E7%89%87"
 * target="_blank">参考文档</a>
 * @see HousePhotoAddDTO
 */
public class HousePhotoAddDTO {

    /**
     * 售:Sale; 租:Lease
     * {@link HouseType}
     */
    private String houseType;
    /**
     * 房源id
     */
    private Integer houseid;
    /**
     * 图片名称
     */
    private String photoname;
    /**
     * 图片类型（1: 室内图 3:户型图 2:小区相关图 6：内景图 7：外景图 4：交通图 5：平面图）
     * 注释：
     * 商铺只能上传  内景图、外景图
     * 住宅只能上传 户型图、室内图、小区相关图
     * 写字楼只能上传 交通图、平面图、内景图、外景图
     * 别墅只能上传 户型图、室内图、小区相关图
     */
    private Integer albumid;
    /**
     * 图片地址
     */
    private String photourl;


    public String getHouseType() {
        return houseType;
    }

    /**
     * @param houseType 售:Sale; 租:Lease  {@link HouseType}
     */
    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getPhotoname() {
        return photoname;
    }

    /**
     * @param photoname 图片名称
     */
    public void setPhotoname(String photoname) {
        this.photoname = photoname;
    }

    public Integer getAlbumid() {
        return albumid;
    }

    /**
     * @param albumid 图片类型（1: 室内图 3:户型图 2:小区相关图 6：内景图 7：外景图 4：交通图 5：平面图）
     *                注释：
     *                商铺只能上传  内景图、外景图
     *                住宅只能上传 户型图、室内图、小区相关图
     *                写字楼只能上传 交通图、平面图、内景图、外景图
     *                别墅只能上传 户型图、室内图、小区相关图
     */
    public void setAlbumid(Integer albumid) {
        this.albumid = albumid;
    }

    public String getPhotourl() {
        return photourl;
    }

    /**
     *
     * @param photourl 图片地址
     */
    public void setPhotourl(String photourl) {
        this.photourl = photourl;
    }

    public Integer getHouseid() {
        return houseid;
    }

    /**
     *
     * @param houseid 房源id
     */
    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }
}
