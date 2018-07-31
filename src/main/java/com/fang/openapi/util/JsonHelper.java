package com.fang.openapi.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @program: openapi-java-sdk
 * @description: Json帮助类
 * @author: Songle
 * @create: 2018-07-18 19:04
 **/
public class JsonHelper {
    /**
     * Logger for this class
     */
    private static final Logger logger = LoggerFactory.getLogger(JsonHelper.class);

    private final static ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    private JsonHelper() {
    }

    public static String encode(Object obj) throws JsonProcessingException {

        return objectMapper.writeValueAsString(obj);

    }

    /**
     * 将json string反序列化成对象
     *
     * @param json
     * @param valueType
     * @return
     */
    public static <T> T decode(String json, Class <T> valueType) throws IOException {

        return objectMapper.readValue(json, valueType);

    }

    /**
     * 将json array反序列化为对象
     *
     * @param json
     * @param
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T decode(String json, TypeReference <T> typeReference) throws IOException {
        return (T) objectMapper.readValue(json, typeReference);
    }
}

