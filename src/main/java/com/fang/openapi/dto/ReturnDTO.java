package com.fang.openapi.dto;

/**
 * 通用http接口返回类
 * @author: Songle
 * @create: 2018-07-21 16:10
 **/
public class ReturnDTO {
    private Integer code;
    private String description;

    public Integer getCode() {
        return code;
    }

    /**
     * 验证是否发是否正常
     * @return true正常
     */
    public Boolean isSuccess() {
        return this.code == 1;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ReturnDTO{" +
                "code=" + code +
                ", description='" + description + '\'' +
                '}';
    }
}
