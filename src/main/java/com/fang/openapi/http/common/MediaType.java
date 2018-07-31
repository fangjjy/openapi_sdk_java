package com.fang.openapi.http.common;


/**
 * Description: ${todo}(用一句话描述该文件做什么)
 * author: wjs(www.itdancer.cn)
 * date: 2018/7/24
 * version: V1.0
 */
public enum MediaType {

    APP_FORM_URLENCODED("application/x-www-form-urlencoded"),
    TEXT_JSON("text/json");

    String value;

    MediaType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    /**
     * @param other
     * @return
     */
    public boolean isCompatibleWith(MediaType other) {
        if (this.value.equals(other.getValue())) {
            return true;
        }
        return false;
    }


}
