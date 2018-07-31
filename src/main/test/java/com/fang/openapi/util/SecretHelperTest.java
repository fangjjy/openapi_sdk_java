package com.fang.openapi.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecretHelperTest {

    @Test
    public void desEncode() {
        String org = "fangtianxia";
        String key = "jjrxxxxx";
        String des = "";
        try {
            des = SecretHelper.desEncode(org, key);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(des, "/dwLiKJUZCOKkgTY4oqcyA==");
    }

    @Test
    public void md5() {
    }
}