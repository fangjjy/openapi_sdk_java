package com.fang.openapi.dto.photo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 房源图片列表输出
 *
 * @author wjs
 * @version v1.0.0
 * @create: 2018-07-26 10:57
 * @see HousePhotoListDTO
 */
public class HousePhotoListDTO {

    /**
     * 房源 ID
     */
    @JsonProperty("HouseID")
    private Integer houseid;
    /**
     * 图片 ID
     */
    @JsonProperty("PhotoID")
    private Integer photoid;
    /**
     * 图片地址
     */
    @JsonProperty("PHOTOURL")
    private String photourl;
    /**
     * 图片名称
     */
    @JsonProperty("PHOTONAME")
    private String photoname;
    /**
     * 图片类型id
     */
    @JsonProperty("ALBUMID")
    private Integer albumid;
    /**
     * 图片类型
     */
    @JsonProperty("ALBUMNAME")
    private String albumname;

    public Integer getHouseid() {
        return houseid;
    }

    /**
     *
     * @param houseid 房源 ID
     */
    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public Integer getPhotoid() {
        return photoid;
    }

    /**
     *
     * @param photoid 图片 ID
     */
    public void setPhotoid(Integer photoid) {
        this.photoid = photoid;
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

    public String getPhotoname() {
        return photoname;
    }

    /**
     *
     * @param photoname 图片名称
     */
    public void setPhotoname(String photoname) {
        this.photoname = photoname;
    }

    public Integer getAlbumid() {
        return albumid;
    }

    /**
     *
     * @param albumid 图片类型id
     */
    public void setAlbumid(Integer albumid) {
        this.albumid = albumid;
    }

    public String getAlbumname() {
        return albumname;
    }

    /**
     *
     * @param albumname 图片类型
     */
    public void setAlbumname(String albumname) {
        this.albumname = albumname;
    }
}
