package com.fang.openapi.service;

import com.fang.openapi.consts.HouseType;
import com.fang.openapi.dto.ReturnDTO;
import com.fang.openapi.dto.ReturnGenericDTO;
import com.fang.openapi.dto.auth.AuthDTO;
import com.fang.openapi.dto.auth.CompanyKeyUnit;
import com.fang.openapi.dto.photo.*;
import com.fang.openapi.http.common.HttpUtils;
import com.fang.openapi.http.exception.HttpProcessException;
import com.fang.openapi.util.JsonHelper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 房源图片管理相关接口
 *
 * @author wjs
 * @version v1.0.0
 * @create: 2018-07-26 10:57
 * @see <a href="https://github.com/fangjjy/openapi_document/wiki" target="_blank">参考文档</a>
 * @see HousePhotoManager
 */
public class HousePhotoManager extends BaseServiceAbtract {


    /**
     * 构造函数
     *
     * @param keyUnit 搜房帮申请的key {@link CompanyKeyUnit}
     */
    public HousePhotoManager(CompanyKeyUnit keyUnit) {
        super(keyUnit);
    }

    /**
     * 获取房源图片列表接口
     *
     * @param authDTO   权限信息 {@link AuthDTO}
     * @param houseType 房源类型 售:Sale; 租:Lease {@link HouseType}
     * @param houseid   houseid
     * @return 返回结果 {@link ReturnGenericDTO,HousePhotoListDTO}
     * @throws HttpProcessException 异常
     * @see <a href="https://github.com/fangjjy/openapi_document/wiki/%E8%8E%B7%E5%8F%96%E6%88%BF%E6%BA%90%E5%9B%BE%E7%89%87%E5%88%97%E8%A1%A8%E6%8E%A5%E5%8F%A3" target="_blank">参考文档</a>
     */

    public ReturnGenericDTO <List <HousePhotoListDTO>> HousePhotoList(AuthDTO authDTO, String houseType, Integer houseid)
            throws HttpProcessException, IOException {
        Map <String, String> header = getHeader(authDTO);
        Map <String, Object> params = new HashMap <String, Object>();
        params.put("houseType", houseType);
        params.put("houseid", houseid);
        String result = super.httpclient.doGet(authDTO.getUrl() + "House/HousePhotoList", header,
                params);
        ReturnGenericDTO <List <HousePhotoListDTO>> obj = JsonHelper.decode(result,
                new TypeReference <ReturnGenericDTO <List <HousePhotoListDTO>>>() {
                });
        return obj;
    }

    /**
     * 上传房源图片接口
     *
     * @param authDTO 权限信息 {@link AuthDTO}
     * @param input   输入参数 {@link HousePhotoAddDTO}
     * @return 返回结果 {@link ReturnDTO}
     * @throws HttpProcessException 异常
     * @see <a href="https://github.com/fangjjy/openapi_document/wiki/%E4%B8%8A%E4%BC%A0%E6%88%BF%E6%BA%90%E5%9B%BE%E7%89%87" target="_blank">参考文档</a>
     */
    public ReturnDTO HousePhotoAdd(AuthDTO authDTO, HousePhotoAddDTO input)
            throws HttpProcessException, IOException {
        Map <String, String> header = getHeader(authDTO);
        String result = super.httpclient.doPost(authDTO.getUrl() + "/House/HousePhotoAdd", header,
                HttpUtils.getPropertiesMap(input));
        ReturnDTO obj = JsonHelper.decode(result,
                new TypeReference <ReturnDTO>() {
                });
        return obj;
    }

    /**
     * 修改房源图片名称接口
     *
     * @param authDTO 权限信息 {@link AuthDTO}
     * @param input   输入参数 {@link HousePhotoModifyDTO}
     * @return 返回结果  {@link ReturnDTO}
     * @throws HttpProcessException 异常
     * @see <a href="https://github.com/fangjjy/openapi_document/wiki/%E4%BF%AE%E6%94%B9%E6%88%BF%E6%BA%90%E5%9B%BE%E7%89%87%E5%90%8D%E7%A7%B0" target="_blank">参考文档</a>
     */
    public ReturnDTO HousePhotoModify(AuthDTO authDTO, HousePhotoModifyDTO input)
            throws HttpProcessException, IOException {
        Map <String, String> header = getHeader(authDTO);
        String result = super.httpclient.doPost(authDTO.getUrl() + "/House/HousePhotoModify", header,
                HttpUtils.getPropertiesMap(input));
        ReturnDTO obj = JsonHelper.decode(result,
                new TypeReference <ReturnDTO>() {
                });
        return obj;
    }

    /**
     * 删除房源图片接口
     *
     * @param authDTO 权限信息 {@link AuthDTO}
     * @param input   输入参数 {@link HousePhotoDeleteDTO}
     * @return 返回结果 {@link ReturnDTO}
     * @throws HttpProcessException 异常
     * @see <a href="https://github.com/fangjjy/openapi_document/wiki/%E5%88%A0%E9%99%A4%E6%88%BF%E6%BA%90%E5%9B%BE%E7%89%87%E6%8E%A5%E5%8F%A3" target="_blank">参考文档</a>
     */
    public ReturnDTO HousePhotoDelete(AuthDTO authDTO, HousePhotoDeleteDTO input) throws HttpProcessException, IOException {
        Map <String, String> header = getHeader(authDTO);
        String result = super.httpclient.doPost(authDTO.getUrl() + "/House/HousePhotoDelete", header,
                HttpUtils.getPropertiesMap(input));
        ReturnDTO obj = JsonHelper.decode(result,
                new TypeReference <ReturnDTO>() {
                });
        return obj;
    }


    /**
     * 房源图片批量上传接口
     * <p>
     * 注意：
     * 商铺只能上传  内景图、外景图
     * 住宅只能上传 户型图、室内图、小区相关图
     * 写字楼只能上传 交通图、平面图、内景图、外景图
     * 别墅只能上传 户型图、室内图、小区相关图
     *
     * @param authDTO 权限信息 {@link AuthDTO}
     * @param input   参数 {@link HousePhotoMultAddDTO}
     * @return 结果集 {@link ReturnGenericDTO}
     * @throws HttpProcessException 异常
     * @see <a href="https://github.com/fangjjy/openapi_document/wiki/%E6%88%BF%E6%BA%90%E5%9B%BE%E7%89%87%E6%89%B9%E9%87%8F%E4%B8%8A%E4%BC%A0%E6%8E%A5%E5%8F%A3" target="_blank">参考文档</a>
     */
    public ReturnGenericDTO <String> HousePhotoMultAdd(AuthDTO authDTO, HousePhotoMultAddDTO input)
            throws HttpProcessException, IOException {
        Map <String, String> header = getHeader(authDTO);
        Map <String, Object> params = new HashMap <String, Object>();
        params.put("houseType", input.getHouseType());
        params.put("houseid", input.getHouseid());
        if (input.getImage1() != null && input.getImage1().size() > 0) {
            params.put("image1", JsonHelper.encode(input.getImage1()));
        }
        if (input.getImage2() != null && input.getImage2().size() > 0) {
            params.put("image2", JsonHelper.encode(input.getImage2()));
        }
        if (input.getImage3() != null && input.getImage3().size() > 0) {
            params.put("image3", JsonHelper.encode(input.getImage3()));
        }
        if (input.getImage4() != null && input.getImage4().size() > 0) {
            params.put("image4", JsonHelper.encode(input.getImage4()));
        }
        if (input.getImage5() != null && input.getImage5().size() > 0) {
            params.put("image5", JsonHelper.encode(input.getImage5()));
        }
        if (input.getImage6() != null && input.getImage6().size() > 0) {
            params.put("image6", JsonHelper.encode(input.getImage6()));
        }
        if (input.getImage7() != null && input.getImage7().size() > 0) {
            params.put("image7", JsonHelper.encode(input.getImage7()));
        }
        String result = super.httpclient.doPost(authDTO.getUrl() + "/House/HousePhotoMultAdd", header, params);
        ReturnGenericDTO <String> obj = JsonHelper.decode(result,
                new TypeReference <ReturnGenericDTO <String>>() {
                });
        return obj;
    }

    /**
     * 设置标题图接口
     *
     * @param authDTO   权限信息 {@link AuthDTO}
     * @param houseType 房源类型 售:Sale; 租:Lease {@link HouseType}
     * @param photourl  房源标题图地址
     * @param houseid   房源id（例如1001,1002,1003）
     * @return 结果集 {@link ReturnDTO}
     * @throws HttpProcessException 异常
     * @see <a href="https://github.com/fangjjy/openapi_document/wiki/%E8%AE%BE%E7%BD%AE%E6%A0%87%E9%A2%98%E5%9B%BE%E6%8E%A5%E5%8F%A3" target="_blank">参考文档</a>
     */
    public ReturnDTO HouseTitlePictureModify(AuthDTO authDTO, String houseType
            , String photourl, Integer houseid)
            throws HttpProcessException, IOException {
        Map <String, Object> params = new HashMap <String, Object>();
        params.put("houseType", houseType);
        params.put("photourl", photourl);
        params.put("houseid", houseid);
        Map <String, String> header = getHeader(authDTO);
        String result = super.httpclient.doPost(authDTO.getUrl() + "/House/HouseTitlePictureModify", header,
                params);
        ReturnDTO obj = JsonHelper.decode(result,
                new TypeReference <ReturnDTO>() {
                });
        return obj;
    }

}
