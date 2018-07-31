package com.fang.openapi.http;

import com.fang.openapi.http.common.HttpConfig;
import com.fang.openapi.http.common.HttpHeader;
import com.fang.openapi.http.common.HttpUtils;
import com.fang.openapi.http.common.MediaType;
import com.fang.openapi.http.exception.HttpProcessException;
import com.fang.openapi.http.httpclient.HttpClientUtil;
import com.fang.openapi.http.httpclient.builder.HCB;
import com.fang.openapi.util.PropertiesUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.http.Header;

import java.util.Map;
import java.util.UUID;

/**
 * Description: ${todo}(用一句话描述该文件做什么)
 * author: wjs(www.itdancer.cn)
 * date: 2018/7/24
 * version: V1.0
 */
class DefaultHttp implements HttpInterface {


    private MediaType contentType = MediaType.APP_FORM_URLENCODED;
    private Header[] headers;
    private HCB hcb;

    public DefaultHttp(HCB hcb) {
        this.hcb = hcb;
    }

    public DefaultHttp() {
        try {
            hcb = HCB.custom().timeout(7000)
                    .pool(20, 20).retry(5);
        } catch (HttpProcessException e) {
            HttpUtils.errorException("httpclient初始化异常", e);
        }
    }

    /**
     * @param url    地址
     * @param header 头信息
     * @param params 参数
     * @return
     * @throws HttpProcessException
     */
    @Override
    public String doGet(String url, Map<String, String> header, Map<String, Object> params)
            throws HttpProcessException, JsonProcessingException {
        String result = HttpClientUtil.get(configMap(url, header, params));
        return result;
    }

    /**
     * @param url    地址
     * @param header 头信息
     * @param params 参数
     * @return 结果
     * @throws HttpProcessException 异常
     */
    @Override
    public String doPost(String url, Map<String, String> header, Map<String, Object> params)
            throws HttpProcessException, JsonProcessingException {
        String result = "";
        if (contentType.isCompatibleWith(MediaType.APP_FORM_URLENCODED)) {
            result = HttpClientUtil.post(configMap(url, header, params));
        } else if (contentType.isCompatibleWith(MediaType.TEXT_JSON)) {
//            result = HttpClientUtil.post(configJSON(url, header, JSON.toJSONString(body)));
        }
        return result;
    }


    /**
     * 设置 contentType
     *
     * @param contentType 类别
     */
    public void setContentType(MediaType contentType) {
        this.contentType = contentType;
    }

    /**
     * 初始化config
     *
     * @param url    地址
     * @param params 参数
     * @return 返回config
     * @throws HttpProcessException 异常
     */
    private HttpConfig config(String url, Map<String, Object> params)
            throws HttpProcessException {
        HttpConfig config = HttpConfig.custom()
                .headers(headers)
                .url(url)
                .map(params)
                .encoding("utf-8")
                .hcb(hcb);
        return config;
    }

    /**
     * 初始化config
     *
     * @param url        地址
     * @param headersmap 头信息
     * @param params     参数
     * @return 返回config
     */
    private HttpConfig configMap(String url, Map<String, String> headersmap, Map<String, Object> params) {
        try {
//            if (headersmap != null) {
//                StringBuffer buffer = new StringBuffer();
//                String KeyId = "";
//                if (headersmap.containsKey("KeyId")) {
//                    KeyId = headersmap.get("KeyId");
//                }
//                String guid = UUID.randomUUID().toString();
//                String version = PropertiesUtil.getPropery("project.version");
//                buffer.append(KeyId).append("-").append(guid).append("-").append(version);
//                headersmap.put("requestid", buffer.toString());
//            }
            HttpConfig config = HttpConfig.custom()
                    .hcb(hcb)
                    .headers(buildOtherHeader(headersmap))
                    .url(url)
                    .encoding("utf-8")
                    .map(params);
            return config;
        } catch (Exception e) {
            HttpConfig config = HttpConfig.custom()
                    .headers(buildOtherHeader(headersmap))
                    .url(url)
                    .encoding("utf-8")
                    .map(params);
            return config;
        }
    }

    /**
     * 初始化config
     *
     * @param url        地址
     * @param headersmap 头信息
     * @param json       参数
     * @return 返回config
     */
    private HttpConfig configJSON(String url, Map<String, String> headersmap, String json)
            throws HttpProcessException {
        HttpConfig config = HttpConfig.custom()
                .hcb(hcb)
                .headers(buildOtherHeader(headersmap))
                .url(url)
                .encoding("utf-8")
                .json(json);//json方式请求的话，就不用设置map方法，当然二者可以公用
        return config;
    }

    /**
     * 配置Header，自定义Header
     *
     * @param headersmap 头信息
     * @return
     */
    private Header[] buildOtherHeader(Map<String, String> headersmap) {
        HttpHeader headerss = HttpHeader.custom()
                .accept("text/plain,text/html,application/json")
                .contentType(contentType.getValue());
        if (null == headersmap) {
            return headerss.build();
        }
        for (String key : headersmap.keySet()) {
            headerss.other(key, headersmap.get(key));
        }
        return headerss.build();
    }

}
