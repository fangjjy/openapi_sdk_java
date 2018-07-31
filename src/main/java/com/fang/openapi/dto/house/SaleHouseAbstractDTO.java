package com.fang.openapi.dto.house;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * 所有出售房源基础DTO
 *
 * @version 1.0.0
 * @author: Songle
 * @create: 2018-06-08 16:20
 **/
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "purpose")
public abstract class SaleHouseAbstractDTO extends HouseBaseAbstractDTO {
}
