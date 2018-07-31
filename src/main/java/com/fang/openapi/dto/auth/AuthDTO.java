package com.fang.openapi.dto.auth;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 用户授权成功，返回的授权信息，建议用户根据用户名将该信息缓存到自己的缓存服务器
 * @author: Songle
 * @create: 2018-07-18 17:48
 **/
public class AuthDTO implements Serializable {
    @JsonProperty("Token")
    private String token;
    @JsonProperty("URL")
    private String url;
    /**
     * 用户的bid
     */
    private String bUserId;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getbUserId() {
        return bUserId;
    }

    public void setbUserId(String bUserId) {
        this.bUserId = bUserId;
    }

    @Override
    public String toString() {
        return "AuthDTO{" +
                "token='" + token + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
