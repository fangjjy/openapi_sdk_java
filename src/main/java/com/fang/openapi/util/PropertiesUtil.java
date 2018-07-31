package com.fang.openapi.util;

import java.io.*;
import java.util.Properties;

/**
 * Description: ${todo}(用一句话描述该文件做什么)
 * author: wjs(www.itdancer.cn)
 * date: 2018/7/25
 * version: V1.0
 */
public class PropertiesUtil {

    private static final String properiesName = "application.properties";
    private static Properties prop = new Properties();

    static {
        InputStream is = null;
        try {
            is = PropertiesUtil.class.getClassLoader().getResourceAsStream(properiesName);
            prop.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 根据key获取value
     *
     * @param key
     * @return
     */
    public static String getPropery(String key) {
        return prop.getProperty(key);
    }

    /**
     * @param key
     * @param value
     */
    public void writeProperty(String key, String value) {
        InputStream is = null;
        OutputStream os = null;
        Properties p = new Properties();
        try {
            is = new FileInputStream(properiesName);
            p.load(is);
            os = new FileOutputStream(PropertiesUtil.class.getClassLoader().getResource(properiesName).getFile());
            p.setProperty(key, value);
            p.store(os, key);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != is)
                    is.close();
                if (null != os)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
