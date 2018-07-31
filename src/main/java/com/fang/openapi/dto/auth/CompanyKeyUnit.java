package com.fang.openapi.dto.auth;

/**
 * 从房天下申请的OPenApi操作key和秘钥
 * @author: Songle
 * @create: 2018-07-18 17:23
 **/
public class CompanyKeyUnit {
    private Long keyId;
    private String secret;

    public Long getKeyId() {
        return keyId;
    }

    public void setKeyId(Long keyId) {
        this.keyId = keyId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
