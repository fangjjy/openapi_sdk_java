package com.fang.openapi.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 字符串测试类
 */
public class StringHelperTest {

    @Test
    public void isNullOrEmpty() {
        Assert.assertTrue(StringHelper.isNullOrEmpty(""));
        Assert.assertTrue(StringHelper.isNullOrEmpty(null));
        Assert.assertFalse(StringHelper.isNullOrEmpty("abc"));
    }
}