package com.fang.openapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 通用http接口返回类（支持泛型）
 * @author: Songle
 * @create: 2018-07-18 17:27
 **/
public class ReturnGenericDTO<T> extends ReturnDTO {

    @JsonProperty("returnmsgs")
    private  T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
