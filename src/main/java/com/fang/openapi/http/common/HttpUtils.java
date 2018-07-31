package com.fang.openapi.http.common;

import com.fang.openapi.util.JsonHelper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.FileEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.*;
import java.util.Map.Entry;


public class HttpUtils {

    private static final Logger logger = LoggerFactory.getLogger(HttpUtils.class);
    /**
     * 是否开启debug，
     */
    private static boolean debug = true;

    private static HttpUtils utils;
    //传入参数特定类型
    public static final String ENTITY_STRING = "$ENTITY_STRING$";
    public static final String ENTITY_FILE = "$ENTITY_FILEE$";
    public static final String ENTITY_BYTES = "$ENTITY_BYTES$";
    public static final String ENTITY_INPUTSTREAM = "$ENTITY_INPUTSTREAM$";
    public static final String ENTITY_SERIALIZABLE = "$ENTITY_SERIALIZABLE$";
    public static final String ENTITY_MULTIPART = "$ENTITY_MULTIPART$";
    private static final List<String> SPECIAL_ENTITIY = Arrays
            .asList(ENTITY_STRING, ENTITY_BYTES, ENTITY_FILE, ENTITY_INPUTSTREAM, ENTITY_SERIALIZABLE, ENTITY_MULTIPART);


    /**********/
    @PostConstruct
    public void init() {//注入用，没有会报空引用
        utils = this;
    }

    /**
     * 检测url是否含有参数，如果有，则把参数加到参数列表中
     *
     * @param url  资源地址
     * @param nvps 参数列表
     * @return 返回去掉参数的url
     * @throws UnsupportedEncodingException
     */
    public static String checkHasParas(String url, List<NameValuePair> nvps, String encoding) throws UnsupportedEncodingException {
        // 检测url中是否存在参数
        if (url.contains("?") && url.indexOf("?") < url.indexOf("=")) {
            Map<String, Object> map = buildParas(url.substring(url
                    .indexOf("?") + 1));
            map2HttpEntity(nvps, map, encoding);
            url = url.substring(0, url.indexOf("?"));
        }
        return url;
    }

    /**
     * 参数转换，将map中的参数，转到参数列表中
     *
     * @param nvps 参数列表
     * @param map  参数列表（map）
     * @throws UnsupportedEncodingException
     */
    public static HttpEntity map2HttpEntity(List<NameValuePair> nvps, Map<String, Object> map, String encoding)
            throws UnsupportedEncodingException {
        HttpEntity entity = null;
        if (map != null && map.size() > 0) {
            boolean isSpecial = false;
            // 拼接参数
            for (Entry<String, Object> entry : map.entrySet()) {
                if (SPECIAL_ENTITIY.contains(entry.getKey())) {//判断是否在之中
                    isSpecial = true;
                    if (ENTITY_STRING.equals(entry.getKey())) {//string
                        entity = new StringEntity(String.valueOf(entry.getValue()), encoding);
                        break;
                    } else if (ENTITY_BYTES.equals(entry.getKey())) {//file
                        entity = new ByteArrayEntity((byte[]) entry.getValue());
                        break;
                    } else if (ENTITY_FILE.equals(entry.getKey())) {//file
                        if (File.class.isAssignableFrom(entry.getValue().getClass())) {
                            entity = new FileEntity((File) entry.getValue(), ContentType.APPLICATION_OCTET_STREAM);
                        } else if (entry.getValue().getClass() == String.class) {
                            entity = new FileEntity(new File((String) entry.getValue()), ContentType.create("text/plain", "UTF-8"));
                        }
                        break;
                    } else if (ENTITY_INPUTSTREAM.equals(entry.getKey())) {//inputstream
//						entity = new InputStreamEntity();
                        break;
                    } else if (ENTITY_SERIALIZABLE.equals(entry.getKey())) {//serializeable
//						entity = new SerializableEntity()
                        break;
                    } else if (ENTITY_MULTIPART.equals(entry.getKey())) {//MultipartEntityBuilder
//                        File[] files = null;
//                        if (File.class.isAssignableFrom(entry.getValue().getClass().getComponentType())) {
//                            files = (File[]) entry.getValue();
//                        } else if (entry.getValue().getClass().getComponentType() == String.class) {
//                            String[] names = (String[]) entry.getValue();
//                            files = new File[names.length];
//                            for (int i = 0; i < names.length; i++) {
//                                files[i] = new File(names[i]);
//                            }
//                        }
//                        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
//                        builder.setCharset(Charset.forName(encoding));// 设置请求的编码格式
//                        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);// 设置浏览器兼容模式
//                        int count = 0;
//                        for (File file : files) {
////							//把文件转换成流对象FileBody
////							FileBody fileBody = new FileBody(file);
////							builder.addPart(String.valueOf(map.get(ENTITY_MULTIPART+".name")) + count++, fileBody);
//                            builder.addBinaryBody(String.valueOf(map.get(ENTITY_MULTIPART + ".name")) + count++, file);
//                        }
//                        boolean forceRemoveContentTypeCharset = (Boolean) map.get(ENTITY_MULTIPART + ".rmCharset");
//                        Map<String, Object> m = new HashMap<String, Object>();
//                        m.putAll(map);
//                        m.remove(ENTITY_MULTIPART);
//                        m.remove(ENTITY_MULTIPART + ".name");
//                        m.remove(ENTITY_MULTIPART + ".rmCharset");
//                        Iterator<Entry<String, Object>> iterator = m.entrySet().iterator();
//                        // 发送的数据
//                        while (iterator.hasNext()) {
//                            Entry<String, Object> e = iterator.next();
//                            builder.addTextBody(e.getKey(), String.valueOf(e.getValue()), ContentType.create("text/plain", encoding));
//                        }
//                        entity = builder.build();// 生成 HTTP POST 实体
//
//                        //强制去除contentType中的编码设置，否则，在某些情况下会导致上传失败
//                        if (forceRemoveContentTypeCharset) {
//                            removeContentTypeChraset(encoding, entity);
//                        }
                        break;
                    } else {
                        nvps.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
                    }
                } else {
                    nvps.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
                }
            }
            if (!isSpecial) {
                entity = new UrlEncodedFormEntity(nvps, encoding);
            }
        }
        return entity;
    }

    /**
     * 强制去除contentType中的编码设置，否则，在某些情况下会导致上传失败
     *
     * @param encoding 编码
     * @param entity   参数
     */
    private static void removeContentTypeChraset(String encoding, HttpEntity entity) {
        try {
            Class<?> clazz = entity.getClass();
            Field field = clazz.getDeclaredField("contentType");
            field.setAccessible(true); //将字段的访问权限设为true：即去除private修饰符的影响
            if (Modifier.isFinal(field.getModifiers())) {
                Field modifiersField = Field.class.getDeclaredField("modifiers"); //去除final修饰符的影响，将字段设为可修改的
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
            }
            BasicHeader o = (BasicHeader) field.get(entity);
            field.set(entity, new BasicHeader(HTTP.CONTENT_TYPE, o.getValue().replace("; charset=" + encoding, "")));
        } catch (NoSuchFieldException e) {
            HttpUtils.errorException("异常", e);
        } catch (SecurityException e) {
            HttpUtils.errorException("异常", e);
        } catch (IllegalArgumentException e) {
            HttpUtils.errorException("异常", e);
        } catch (IllegalAccessException e) {
            HttpUtils.errorException("异常", e);
        }
    }


    /**
     * 生成参数
     * 参数格式“k1=v1&k2=v2”
     *
     * @param paras 参数列表
     * @return 返回参数列表（map）
     */
    public static Map<String, Object> buildParas(String paras) {
        String[] p = paras.split("&");
        String[][] ps = new String[p.length][2];
        int pos = 0;
        for (int i = 0; i < p.length; i++) {
            pos = p[i].indexOf("=");
            ps[i][0] = p[i].substring(0, pos);
            ps[i][1] = p[i].substring(pos + 1);
            pos = 0;
        }
        return buildParas(ps);
    }

    /**
     * 生成参数
     * 参数类型：{{"k1","v1"},{"k2","v2"}}
     *
     * @param paras 参数列表
     * @return 返回参数列表（map）
     */
    public static Map<String, Object> buildParas(String[][] paras) {
        // 创建参数队列
        Map<String, Object> map = new HashMap<String, Object>();
        for (String[] para : paras) {
            map.put(para[0], para[1]);
        }
        return map;
    }

    /**
     * 打印消息
     *
     * @param msg
     */
    public static void info(String msg) {
        if (debug) {
            logger.info(msg);
        }
    }

    /**
     * 打印消息
     *
     * @param obj 信息实体
     */
    public static void info(Object obj) throws JsonProcessingException {
        if (debug) {
            logger.info(JsonHelper.encode(obj));
        }
    }

    /**
     * 打印错误消息
     *
     * @param msg
     */
    public static void error(String msg) {
        logger.error(msg);
    }

    /**
     * 打印错误消息
     *
     * @param obj 信息实体
     */
    public static void error(Object obj) throws JsonProcessingException {
        logger.error(JsonHelper.encode(obj));
    }

    /**
     * 打印错误消息和异常堆栈
     *
     * @param msg
     * @param t
     */
    public static void errorException(String msg, Throwable t) {
        logger.error(msg, t);
    }


    /**
     * 开启打印日志
     */
    public static void debug() {
        debug(true);
    }

    /**
     * 开启或关闭打印日志
     */
    public static void debug(boolean debug) {
        HttpUtils.debug = debug;
    }


    /**
     * 获取javaBean的form-urlencoded拼接字符串
     *
     * @param javaBean 实体
     * @return 返回
     */
    public static String getFormUrlEncodedStr(Object javaBean) throws IOException {
        if (javaBean == null) {
            return "";
        }
        if (javaBean instanceof String) {
            return (String) javaBean;
        }
        Map<String, Object> paramKV = getPropertiesMap(javaBean);
        return getFormUrlEncodedStr(paramKV, false, null);
    }

    /**
     * bean to map
     *
     * @param javaBean bean
     * @return map
     */
    public static Map<String, Object> getPropertiesMap(Object javaBean) throws IOException {
        if (javaBean instanceof Map) {
            return (Map<String, Object>) javaBean;
        }
        Map<String, Object> out = JsonHelper.decode(JsonHelper.encode(javaBean),
                new TypeReference<Map<String, Object>>() {
                });
        return out;
    }

    /**
     * 获取javaBean的form-urlencoded拼接字符串
     *
     * @param paramKV
     * @param toUrlEncoded
     * @param encodeName
     * @return
     */
    public static String getFormUrlEncodedStr(Map<String, Object> paramKV, boolean toUrlEncoded, String encodeName) {
        StringBuilder paramSb = new StringBuilder();
        ArrayList<String> paramList = new ArrayList<String>();
        for (Map.Entry<String, Object> entry : paramKV.entrySet()) {
            try {
                String valueStr = entry.getValue() == null ? "" : String.valueOf(entry.getValue());
                paramList.add(String.format("%s=%s", entry.getKey(),
                        toUrlEncoded ? urlEncode(valueStr, encodeName) : valueStr));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        String paramJointStr = join(paramList, "&");
        return paramJointStr;
    }

    /**
     * 字符添加
     *
     * @param var0
     * @param var1
     * @return
     */
    public static String join(Collection var0, String var1) {
        StringBuffer var2 = new StringBuffer();

        for (Iterator var3 = var0.iterator(); var3.hasNext(); var2.append((String) var3.next())) {
            if (var2.length() != 0) {
                var2.append(var1);
            }
        }

        return var2.toString();
    }

    /**
     * 拼接的参数进行编码
     *
     * @param rawQueryStr 参数
     * @param encodeName  格式
     * @return 返回
     */
    public static String encodeRawQuery(String rawQueryStr, String encodeName) {
        if (rawQueryStr == null) {
            return null;
        }
        String encodedQueryStr = "";
        if (!isEmpty(rawQueryStr)) {
            String[] keyValues = split(rawQueryStr, '&');
            if (keyValues != null) {
                for (String keyVal : keyValues) {
                    String[] oneKeyVal = split(keyVal, '=');
                    if (oneKeyVal != null && oneKeyVal.length > 1) {
                        String encodeStr = null;
                        try {
                            // 先解码再编码，防止有些参数已经编码有些未编码的情况
                            encodeStr = URLEncoder.encode(URLDecoder.decode(oneKeyVal[1], encodeName), encodeName);
                        } catch (UnsupportedEncodingException e) {
                            throw new RuntimeException(e);
                        }
                        encodedQueryStr += String.format("&%s=%s", oneKeyVal[0], encodeStr);
                    }
                }
                encodedQueryStr = encodedQueryStr.substring(1, encodedQueryStr.length());
            }
        }
        return encodedQueryStr;
    }

    /**
     * 是否为空
     *
     * @param cs 字符串
     * @return true 为空 反之
     */
    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    /**
     * 编码
     *
     * @param valueStr
     * @param encodeName
     * @return
     * @throws UnsupportedEncodingException
     */
    private static String urlEncode(String valueStr, String encodeName) throws UnsupportedEncodingException {
        String encodedStr = URLEncoder.encode(valueStr, encodeName);
        // 将本不应替换的“%”替换回来（%25为%的encoded值）
        return encodedStr.replace("%25", "%");
    }

    /**
     * 字符串截取
     *
     * @param str
     * @param separatorChar
     * @return
     */
    public static String[] split(final String str, final char separatorChar) {
        return splitWorker(str, separatorChar, false);
    }

    /**
     * 字符串截取
     *
     * @param str
     * @param separatorChar
     * @param preserveAllTokens
     * @return
     */
    private static String[] splitWorker(final String str, final char separatorChar, final boolean preserveAllTokens) {
        // Performance tuned for 2.0 (JDK1.4)

        if (str == null) {
            return null;
        }
        final int len = str.length();
        if (len == 0) {
            return new String[0];
        }
        final List<String> list = new ArrayList<>();
        int i = 0, start = 0;
        boolean match = false;
        boolean lastMatch = false;
        while (i < len) {
            if (str.charAt(i) == separatorChar) {
                if (match || preserveAllTokens) {
                    list.add(str.substring(start, i));
                    match = false;
                    lastMatch = true;
                }
                start = ++i;
                continue;
            }
            lastMatch = false;
            match = true;
            i++;
        }
        if (match || preserveAllTokens && lastMatch) {
            list.add(str.substring(start, i));
        }
        return list.toArray(new String[list.size()]);
    }

}
