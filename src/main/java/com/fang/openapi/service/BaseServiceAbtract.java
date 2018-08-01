package com.fang.openapi.service;

import com.fang.openapi.dto.auth.AuthDTO;
import com.fang.openapi.dto.auth.CompanyKeyUnit;
import com.fang.openapi.http.HttpClientManager;
import com.fang.openapi.http.HttpInterface;
import com.fang.openapi.util.PropertiesUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 服务基础类
 * @author: Songle
 * @create: 2018-07-27 14:17
 **/
abstract class BaseServiceAbtract {
    protected CompanyKeyUnit keyUnit;
    protected HttpInterface httpclient;

    public BaseServiceAbtract(CompanyKeyUnit keyUnit) {
        this.keyUnit = keyUnit;
        this.httpclient =  HttpClientManager.getHttpClient();
    }

    public CompanyKeyUnit getKeyUnit() {
        return keyUnit;
    }

    public void setKeyUnit(CompanyKeyUnit keyUnit) {
        this.keyUnit = keyUnit;
    }

    /**
     * 组装请求header
     *
     * @param authDTO
     * @return 请求header信息
     */
    protected Map <String, String> getHeader(AuthDTO authDTO) {
        String version = PropertiesUtil.getPropery("fang.openapi.version");
        SimpleDateFormat format = new SimpleDateFormat("MMddHHmmssSSS");
        Map <String, String> header = new HashMap <>();
        header.put("Token", authDTO.getToken());
        header.put("KeyId", this.getKeyUnit().getKeyId().toString());
        header.put("DataType", "json");
        header.put("Accept", "text/json");
        header.put("RequestID", this.keyUnit.getKeyId()+"_"+version + "_" + format.format(new Date())+"_"+UUID.randomUUID().toString().replaceAll("-",""));
        return header;
    }
}
