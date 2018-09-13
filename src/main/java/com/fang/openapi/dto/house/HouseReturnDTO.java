package com.fang.openapi.dto.house;

import java.util.List;

/**
 * 房源新增或修改返回DTO
 *
 * @version 1.0.0
 * @author: Songle
 * @create: 2018-07-21 15:55
 **/
public class HouseReturnDTO {
    /**
     * 房源id
     */
    private Integer houseid;
    /**
     * 房源的内部编号
     */
    private String innerid;
    /**
     * 房源
     */
    private String houseurl;
    /**
     * 房源推广成功是1，否则是2
     */
    private Integer flag;
    /**
     * 推广的端，表示房源推广到了那些端
     */
    private List <Integer> promotedto;

    public Integer getHouseid() {
        return houseid;
    }

    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }

    public String getInnerid() {
        return innerid;
    }

    public void setInnerid(String innerid) {
        this.innerid = innerid;
    }

    public String getHouseurl() {
        return houseurl;
    }

    public void setHouseurl(String houseurl) {
        this.houseurl = houseurl;
    }

    public Integer getFalg() {
        return flag;
    }

    public void setFalg(Integer falg) {
        this.flag = falg;
    }

    public List <Integer> getPromotedto() {
        return promotedto;
    }

    public void setPromotedto(List <Integer> promotedto) {
        this.promotedto = promotedto;
    }

    @Override
    public String toString() {
        return "HouseReturnDTO{" +
                "houseid=" + houseid +
                ", innerid=" + innerid +
                ", houseurl='" + houseurl + '\'' +
                ", falg=" + flag +
                ", promotedto=" + promotedto +
                '}';
    }
}
