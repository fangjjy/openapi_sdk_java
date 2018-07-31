package com.fang.openapi.http;

/**
 * HttpClient管理类
 * @author: Songle
 * @create: 2018-07-30 15:28
 **/
public class HttpClientManager {
    private static HttpInterface httpClient;

    /**
     * 获取http请求操作类
     * @return http请求操作类
     */
    public static HttpInterface getHttpClient() {
        if (httpClient == null) {
            httpClient = new DefaultHttp();
        }
        return httpClient;
    }

    /**
     * 设置http请求操作类
     * @param defaultclient http请求操作类，需要实现 {@link HttpInterface}接口
     */
    public static void setHttpClient(HttpInterface defaultclient) {
        HttpClientManager.httpClient = defaultclient;
    }
}
