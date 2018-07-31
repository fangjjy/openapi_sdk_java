package com.fang.openapi.http.common;

/**
 * Description: ${todo}(用一句话描述该文件做什么)
 * author: wjs(www.itdancer.cn)
 * date: 2018/7/28
 * version: V1.0
 */
public class LogInfo {

    /**
     * 地址
     */
    private String url;
    /**
     * 头信息
     */
    private String header;
    /**
     * 参数
     */
    private String params;
    /**
     * 描述
     */
    private String description;
    /**
     * 异常信息
     */
    private String error;


    public LogInfo(String url, String params, String description, String error) {
        this.url = url;
        this.params = params;
        this.description = description;
        this.error = error;
    }

    public LogInfo(String url, String header, String params, String description, String error) {
        this.url = url;
        this.header = header;
        this.params = params;
        this.description = description;
        this.error = error;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
