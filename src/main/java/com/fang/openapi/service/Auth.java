package com.fang.openapi.service;

import com.fang.openapi.dto.ReturnGenericDTO;
import com.fang.openapi.dto.auth.AuthDTO;
import com.fang.openapi.dto.auth.CompanyKeyUnit;
import com.fang.openapi.http.HttpClientManager;
import com.fang.openapi.http.HttpInterface;
import com.fang.openapi.http.exception.HttpProcessException;
import com.fang.openapi.util.JsonHelper;
import com.fang.openapi.util.SecretHelper;
import com.fang.openapi.util.StringHelper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户授权服务
 *
 * @version v1.0.0
 * @author: Songle
 * @create: 2018-07-18 17:47
 **/
public class Auth {
    private HttpInterface mHttpInterface;
    private CompanyKeyUnit keyUnit;
    private String openaidomain;
    private static final Logger logger = LoggerFactory.getLogger(Auth.class);

    public Auth(CompanyKeyUnit keyUnit, String domain) {
        this.mHttpInterface = HttpClientManager.getHttpClient();
        this.keyUnit = keyUnit;
        this.openaidomain = domain;
    }

    /**
     * 申请房天下经纪人token接口，建议根据用户名将AuthDTO数据进行缓存
     *
     * @param username 房天下注册的用户名或手机号
     * @param pwd       用户密码
     * @return 授权数据
     */
    public ReturnGenericDTO <AuthDTO> applyToken(String username, String pwd) throws HttpProcessException, IOException {
        String pwddes = null;
        try {
            pwddes = SecretHelper.desEncode(pwd, keyUnit.getSecret());
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("applyToken des 异常", e);
        }
        Map <String, Object> body = new HashMap <>();
        Map <String, String> header = new HashMap <>();
        body.put("userName", username);
        body.put("pwd", pwddes);
        body.put("keyid", keyUnit.getKeyId().toString());
        body.put("datatype", "json");
        header.put("KeyId", keyUnit.getKeyId().toString());
        header.put("DataType", "json");
        header.put("Accept", "text/json");

        String result = null;
        try {
            result = mHttpInterface.doPost(this.openaidomain + "/agent/UserLoginAuthenticate/"
                    , header, body);
            logger.debug(result);
        } catch (HttpProcessException e) {
            logger.error("applyToken申请token失败", e);
            throw e;
        }
        if (!StringHelper.isNullOrEmpty(result)) {
            ReturnGenericDTO <AuthDTO> obj = JsonHelper.decode(result, new TypeReference <ReturnGenericDTO <AuthDTO>>() {
            });
            return obj;
        }
        return null;
    }
}
