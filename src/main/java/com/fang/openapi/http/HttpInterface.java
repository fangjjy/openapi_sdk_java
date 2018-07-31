package com.fang.openapi.http;

import com.fang.openapi.http.exception.HttpProcessException;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Map;

/**
 * 如果想要自定义请求，请实现这个类
 * @author: wjs
 * @create: 2018-07-30 15:28
 **/
public interface HttpInterface {

    /**
     * @param url    请求接口地址
     * @param header 头信息
     * @param params 参数
     * @return
     * @throws HttpProcessException
     */
    public String doGet(String url, Map<String, String> header, Map<String, Object> params) throws HttpProcessException, JsonProcessingException;


    /**
     * @param url    请求接口地址
     * @param header 头信息
     * @param params 参数
     * @return
     * @throws HttpProcessException
     */
    public String doPost(String url, Map<String, String> header, Map<String, Object> params) throws HttpProcessException, JsonProcessingException;
}
