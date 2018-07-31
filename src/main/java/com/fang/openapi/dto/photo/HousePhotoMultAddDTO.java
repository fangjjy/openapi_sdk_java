package com.fang.openapi.dto.photo;

import com.fang.openapi.consts.HouseType;

import java.util.List;

/**
 * 房源图片批量上传接口
 *
 * @author wjs
 * @version v1.0.0
 * @create: 2018-07-26 10:57
 * @see <a
 * href="https://github.com/fangjjy/openapi_document/wiki/%E6%88%BF%E6%BA%90%E5%9B%BE%E7%89%87%E6%89%B9%E9%87%8F%E4%B8%8A%E4%BC%A0%E6%8E%A5%E5%8F%A3"
 * target="_blank">参考文档</a>
 * @see HousePhotoMultAddDTO
 */
public class HousePhotoMultAddDTO {

    /**
     * 房源类型 售:Sale; 租:Lease
     * {@link HouseType}
     */
    private String houseType;
    /**
     * 室内图
     * (图片地址1~图片名称1,图片地址2~图片名称2,图片地址3~图片名称3)
     * 各种类型的图片数总和不能超过20张
     */
    private List<HousePhotoDTO> image1;
    /**
     * 小区图
     * (图片地址1~图片名称1,图片地址2~图片名称2,图片地址3~图片名称3)
     * 各种类型的图片数总和不能超过20张
     */
    private List<HousePhotoDTO> image2;
    /**
     * 户型图
     * (图片地址1~图片名称1,图片地址2~图片名称2,图片地址3~图片名称3)
     * 各种类型的图片数总和不能超过20张
     */
    private List<HousePhotoDTO> image3;
    /**
     * 交通图
     * (图片地址1~图片名称1,图片地址2~图片名称2,图片地址3~图片名称3)
     * 各种类型的图片数总和不能超过20张
     */
    private List<HousePhotoDTO> image4;
    /**
     * 平面图
     * (图片地址1~图片名称1,图片地址2~图片名称2,图片地址3~图片名称3)
     * 各种类型的图片数总和不能超过20张
     */
    private List<HousePhotoDTO> image5;
    /**
     * 内景图
     * (图片地址1~图片名称1,图片地址2~图片名称2,图片地址3~图片名称3)
     * 各种类型的图片数总和不能超过20张
     */
    private List<HousePhotoDTO> image6;
    /**
     * 外景图
     * (图片地址1~图片名称1,图片地址2~图片名称2,图片地址3~图片名称3)
     * 各种类型的图片数总和不能超过20张
     */
    private List<HousePhotoDTO> image7;
    /**
     * 房源id（例如1001,1002,1003）
     */
    private Integer houseid;

    public String getHouseType() {
        return houseType;
    }

    /**
     * @param houseType 房源类型 售:Sale; 租:Lease  {@link HouseType}
     */
    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public List<HousePhotoDTO> getImage1() {
        return image1;
    }

    /**
     * @param image1 室内图
     *               (图片地址1~图片名称1,图片地址2~图片名称2,图片地址3~图片名称3)
     *               各种类型的图片数总和不能超过20张
     */
    public void setImage1(List<HousePhotoDTO> image1) {
        this.image1 = image1;
    }

    public List<HousePhotoDTO> getImage2() {
        return image2;
    }

    /**
     * @param image2 小区图
     *               (图片地址1~图片名称1,图片地址2~图片名称2,图片地址3~图片名称3)
     *               各种类型的图片数总和不能超过20张
     */
    public void setImage2(List<HousePhotoDTO> image2) {
        this.image2 = image2;
    }

    public List<HousePhotoDTO> getImage3() {
        return image3;
    }

    /**
     * @param image3 户型图
     *               (图片地址1~图片名称1,图片地址2~图片名称2,图片地址3~图片名称3)
     *               各种类型的图片数总和不能超过20张
     */
    public void setImage3(List<HousePhotoDTO> image3) {
        this.image3 = image3;
    }

    public List<HousePhotoDTO> getImage4() {
        return image4;
    }

    /**
     * @param image4 交通图
     *               (图片地址1~图片名称1,图片地址2~图片名称2,图片地址3~图片名称3)
     *               各种类型的图片数总和不能超过20张
     */
    public void setImage4(List<HousePhotoDTO> image4) {
        this.image4 = image4;
    }

    public List<HousePhotoDTO> getImage5() {
        return image5;
    }

    /**
     * @param image5 平面图
     *               (图片地址1~图片名称1,图片地址2~图片名称2,图片地址3~图片名称3)
     *               各种类型的图片数总和不能超过20张
     */
    public void setImage5(List<HousePhotoDTO> image5) {
        this.image5 = image5;
    }

    public List<HousePhotoDTO> getImage6() {
        return image6;
    }

    /**
     * @param image6 内景图
     *               (图片地址1~图片名称1,图片地址2~图片名称2,图片地址3~图片名称3)
     *               各种类型的图片数总和不能超过20张
     */
    public void setImage6(List<HousePhotoDTO> image6) {
        this.image6 = image6;
    }

    public List<HousePhotoDTO> getImage7() {
        return image7;
    }

    /**
     * @param image7 外景图
     *               (图片地址1~图片名称1,图片地址2~图片名称2,图片地址3~图片名称3)
     *               各种类型的图片数总和不能超过20张
     */
    public void setImage7(List<HousePhotoDTO> image7) {
        this.image7 = image7;
    }

    public Integer getHouseid() {
        return houseid;
    }

    /**
     * @param houseid 房源id（例如1001,1002,1003）
     */
    public void setHouseid(Integer houseid) {
        this.houseid = houseid;
    }
}
