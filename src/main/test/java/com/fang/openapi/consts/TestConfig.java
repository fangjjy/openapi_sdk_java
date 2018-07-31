package com.fang.openapi.consts;

import com.fang.openapi.dto.auth.CompanyKeyUnit;

/**
 * 测试配置类
 */
public class TestConfig {

    /**
     * 房天下申请的key信息
     */
    public static final CompanyKeyUnit companyKeyUnit = new CompanyKeyUnit()
    {{
        setKeyId(11111111L);
        setSecret("vrehtrjhbdc6668a2fe2f0dgrthbr");
    }};

    /**
     * 房天下经纪人用户名
     */
    public static final String UserName = "wang****";

    /**
     * 房天下经纪人密码
     */
    public static final String UserPassword = "**********";


    public static final String FangDomain = "http://openapi.agents2.test.fang.com";
}
