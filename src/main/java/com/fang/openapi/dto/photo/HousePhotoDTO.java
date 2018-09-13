package com.fang.openapi.dto.photo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 房源录入用到的图片DTO
 *
 * @version 1.0.0
 * @author: Songle
 * @create: 2018-07-18 17:07
 **/
public class HousePhotoDTO {
    public HousePhotoDTO(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public HousePhotoDTO() {
    }

    /**
     * 图片的地址
     */
    @JsonProperty("url")
    private String url;
    /**
     * 图片名称
     */
    @JsonProperty("name")
    private String name;

    public String getUrl() {
        return url;
    }

    /**
     * 设置图片地址
     *
     * @param url 图片地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    /**
     * 设置图片标题
     *
     * @param name 图片标题
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 格式化为房源录入的图片字段
     *
     * @return
     */
    public String formatString() {
        return String.format("%s~%s", url, name);
    }

    @Override
    public String toString() {
        return String.format("%s~%s", url, name);
    }
}
