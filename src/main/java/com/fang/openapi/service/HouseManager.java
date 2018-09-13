package com.fang.openapi.service;

import com.fang.openapi.consts.HouseType;
import com.fang.openapi.consts.PType;
import com.fang.openapi.consts.PurposeType;
import com.fang.openapi.dto.ReturnDTO;
import com.fang.openapi.dto.ReturnGenericDTO;
import com.fang.openapi.dto.auth.AuthDTO;
import com.fang.openapi.dto.auth.CompanyKeyUnit;
import com.fang.openapi.dto.house.*;
import com.fang.openapi.dto.photo.HousePhotoDTO;
import com.fang.openapi.http.exception.HttpProcessException;
import com.fang.openapi.util.JsonHelper;
import com.fang.openapi.util.ReflectHelper;
import com.fang.openapi.util.StringHelper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 房源管理服务，主要是房源的新增、修改、删除、查询、列表
 * @author: Songle
 * @version 1.0.0
 * @create: 2018-07-18 17:16
 **/

public class HouseManager extends BaseServiceAbtract {
    private static Logger logger = LoggerFactory.getLogger(HouseManager.class);

    /**
     * 构造函数
     *
     * @param keyUnit 搜房帮申请的key
     */
    public HouseManager(CompanyKeyUnit keyUnit) {
        super(keyUnit);
    }

    /**
     * 房源录入
     *
     * @param authDTO      授权接口返回数据
     * @param baseAbstract 房源的具体DTO，请查看{@link HouseBaseAbstractDTO},其分：租售和住宅、别墅、商铺、写字楼
     * @param pType        房源录入推广类型{@link PType}
     * @return 房源是否录入成功，如果录入成功，HouseReturnDTO为录入并推广的一些信息
     * @throws IllegalArgumentException
     * @throws HttpProcessException
     * @throws IOException
     * @see <a href="https://github.com/fangjjy/openapi_document/wiki/%E5%87%BA%E5%94%AE%E4%BD%8F%E5%AE%85%E6%88%BF%E6%BA%90%E5%AF%BC%E5%85%A5%E6%8E%A5%E5%8F%A3">房源录入</a>
     */
    public ReturnGenericDTO <HouseReturnDTO> save(AuthDTO authDTO, HouseBaseAbstractDTO baseAbstract, Integer pType) throws IllegalArgumentException, HttpProcessException, IOException {
        String housetype = getHouseType(baseAbstract);
        if (StringHelper.isNullOrEmpty(housetype)) {
            throw new IllegalArgumentException("错误的房源类型");
        }
        Map <String, Object> form = new HashMap <>();
        form.put("housetype", housetype);
        form.put("ptype", pType);
        Map <String, String> temp = this.transferDTOToForm(baseAbstract);
        if (temp != null && temp.size() > 0) {
            form.putAll(temp);
        }
        Map <String, String> header = getHeader(authDTO);
        String strResult = super.httpclient.doPost(authDTO.getUrl() + "/house/input", header, form);
        ReturnGenericDTO <HouseReturnDTO> result = JsonHelper.decode(strResult, new TypeReference <ReturnGenericDTO <HouseReturnDTO>>() {
        });
        return result;
    }

    /**
     * 房源修改
     *
     * @param authDTO      授权接口返回数据
     * @param baseAbstract 房源的具体DTO，请查看{@link HouseBaseAbstractDTO},其分：租售和住宅、别墅、商铺、写字楼
     * @return 房源是否录入成功，如果录入成功，HouseReturnDTO为录入并推广的一些信息
     * @throws IllegalArgumentException
     * @throws HttpProcessException
     * @throws IOException
     * @see <a href="https://github.com/fangjjy/openapi_document/wiki/%E5%87%BA%E5%94%AE%E4%BD%8F%E5%AE%85%E6%88%BF%E6%BA%90%E4%BF%AE%E6%94%B9%E6%8E%A5%E5%8F%A3">房源录入</a>
     */
    public ReturnGenericDTO <HouseReturnDTO> modify(AuthDTO authDTO, int houseid, HouseBaseAbstractDTO baseAbstract) throws HttpProcessException, IllegalArgumentException, IOException {

        String housetype = getHouseType(baseAbstract);
        if (StringHelper.isNullOrEmpty(housetype)) {
            throw new IllegalArgumentException("错误的房源类型");
        }
        if (houseid < 1000) {
            throw new IllegalArgumentException("错误的houseid");
        }
        Map <String, Object> form = new HashMap <>();
        form.put("housetype", housetype);
        form.put("houseid", houseid);
        Map <String, String> temp = this.transferDTOToForm(baseAbstract);
        if (temp != null && temp.size() > 0) {
            form.putAll(temp);
        }
        Map <String, String> header = getHeader(authDTO);
        String strResult = super.httpclient.doPost(authDTO.getUrl() + "/house/update", header, form);
        ReturnGenericDTO <HouseReturnDTO> result = JsonHelper.decode(strResult, new TypeReference <ReturnGenericDTO <HouseReturnDTO>>() {
        });
        return result;
    }

    /**
     * 获取房源租售类型
     *
     * @param baseAbstract
     * @return 租售类型
     */
    private String getHouseType(HouseBaseAbstractDTO baseAbstract) {
        String housetype = "";
        if (baseAbstract == null) {
            throw new IllegalArgumentException("录入房源不可为空");
        }
        if (baseAbstract instanceof SaleHouseAbstractDTO) {
            housetype = HouseType.SALE;
        } else {
            housetype = HouseType.LEASE;
        }
        if (StringHelper.isNullOrEmpty(housetype)) {
            throw new IllegalArgumentException("错误的房源类型");
        }
        return housetype;
    }

    /**
     * 将实体转化为form表单
     *
     * @param obj
     * @return
     */
    private Map <String, String> transferDTOToForm(HouseBaseAbstractDTO obj) throws JsonProcessingException {
        if (obj == null) return null;
        Map <String, String> form = new HashMap <>();
        //获取主要字段
        Map <String, String> temp = ReflectHelper.transferBeanToForm(obj);
        if (temp != null || temp.size() > 0) {
            form.putAll(temp);
        }
        //获取图像
        temp = getHouseImages(obj);
        if (temp != null || temp.size() > 0) {
            form.putAll(temp);
        }
        return form;
    }

    /***
     * 获取
     * @param obj
     * @return
     */
    public Map <String, String> getHouseImages(HouseBaseAbstractDTO obj) throws JsonProcessingException {
        String[] imageFieldNames = new String[]{"image1", "image2", "image3", "image4", "image5", "image6", "image7", "image8"};
        Map <String, String> map = new HashMap <>();
        for (String fieldname : imageFieldNames) {
            Object val = ReflectHelper.getBeanFieldValue(obj, fieldname);
            if (val != null && val instanceof List) {

                map.put(fieldname, JsonHelper.encode(val));
            }
        }
        return map;
    }


    /**
     * 房源删除接口
     *
     * @param authDTO 授权接口返回数据
     * @param houseType 房源租售类型
     * @param houseId  房天下房源编号
     * @return 操作结果
     * @throws HttpProcessException
     * @throws IOException
     * @see <a href="https://github.com/fangjjy/openapi_document/wiki/%E6%88%BF%E6%BA%90%E5%88%A0%E9%99%A4%E6%8E%A5%E5%8F%A3">房源删除</a>
     */
    public ReturnDTO delete(AuthDTO authDTO, String houseType, Integer houseId) throws HttpProcessException, IOException {
        Map <String, String> header = getHeader(authDTO);
        Map <String, Object> body = new HashMap <>();
        body.put("housetype", houseType);
        body.put("houseid", houseId);
        String strResult = httpclient.doPost(authDTO.getUrl() + "/house/delete", header, body);
        return JsonHelper.decode(strResult, ReturnDTO.class);
    }

    /**
     * 获取房源详情
     *
     * @param authDTO   授权验证信息
     * @param houseType 租售类型 {@link HouseType}
     * @param houseId   房源编号
     * @return 操作结果
     * @throws HttpProcessException
     * @throws IllegalArgumentException
     * @see <a href="https://github.com/fangjjy/openapi_document/wiki/%E6%88%BF%E6%BA%90%E8%AF%A6%E6%83%85%E6%8E%A5%E5%8F%A3">房源详情</a>
     */
    public ReturnGenericDTO <HouseDetailDTO> deteil(AuthDTO authDTO, String houseType, Integer houseId) throws HttpProcessException, IllegalArgumentException, IOException {
        Map <String, String> header = getHeader(authDTO);
        Map <String, Object> params = new HashMap <>();
        params.put("housetype", houseType);
        params.put("houseid", houseId);
        String strResult = super.httpclient.doGet(authDTO.getUrl() + "/house/detail", header, params);
        ReturnGenericDTO <HouseDetailDTO> dto = JsonHelper.decode(strResult, new TypeReference <ReturnGenericDTO <HouseDetailDTO>>() {
        });
        return dto;
    }

    /**
     * 房源列表查询
     *
     * @param authDTO  授权验证信息
     * @param queryDTO 查询调节
     * @return 房源列表
     * @throws HttpProcessException
     * @throws IllegalArgumentException
     * @throws IOException
     * @see <a href="https://github.com/fangjjy/openapi_document/wiki/%E6%88%BF%E6%BA%90%E5%88%97%E8%A1%A8%E6%9F%A5%E8%AF%A2%E6%8E%A5%E5%8F%A3">房源列表</a>
     */
    public ReturnGenericDTO <HousePageDTO> pageList(AuthDTO authDTO, HouseQueryDTO queryDTO) throws HttpProcessException, IllegalArgumentException, IOException {
        Map <String, String> header = getHeader(authDTO);
        String strResult = super.httpclient.doGet(authDTO.getUrl() + "/house/list?" + queryDTO.formatQuery(), header, null);
        ReturnGenericDTO <HousePageDTO> dto;

        ReturnGenericDTO <HousePageDTO> pagedto = JsonHelper.decode(strResult, new TypeReference <ReturnGenericDTO <HousePageDTO>>() {
        });
        return pagedto;
    }

    /**
     * 房源推广，对应接口/House/RealeaseHouse ，action=releasehouse
     *
     * @param authDTO   经纪人授权返回的值 {@link Auth#applyToken(String, String)}
     * @param houseType 房源租售类型 {@link HouseType}
     * @param houseIds  房源id
     * @param pType     推广端 {@link PType}
     * @return 操作结果  {@link ReturnDTO#isSuccess()}
     * @throws HttpProcessException
     * @throws IOException
     * @see <a href=""https://github.com/fangjjy/openapi_document/wiki/%E6%88%BF%E6%BA%90%E6%8E%A8%E5%B9%BF%E5%8F%96%E6%B6%88%E6%8E%A8%E5%B9%BF%E6%8E%A5%E5%8F%A3>房源推广</a>
     */
    public ReturnDTO releaseHouse(AuthDTO authDTO, String houseType, List <Integer> houseIds, Integer pType) throws HttpProcessException, IOException {
        if (houseIds == null || houseIds.size() == 0) {
            throw new IllegalArgumentException("房源id不可为空");
        }
        Map <String, String> header = getHeader(authDTO);
        StringBuilder strHouseids = new StringBuilder();
        for (Integer houseid : houseIds) {
            strHouseids.append(houseid).append(",");
        }
        Map <String, Object> body = new HashMap <>();
        body.put("action", "releasehouse");
        body.put("houseType", houseType);
        body.put("houseids", strHouseids);
        body.put("ptype", pType);

        String strResult = super.httpclient.doPost(authDTO.getUrl() + "/house/RealeaseHouse", header, body);
        return JsonHelper.decode(strResult, ReturnDTO.class);
    }

    /**
     * 取消房源推广 对应接口/House/RealeaseHouse ，action=unreleasehouse
     *
     * @param authDTO   经纪人授权返回的值 <see>Auth</see>
     * @param houseType 房源租售类型 <see>HouseType</see>
     * @param houseIds  房源id
     * @param pType     取消的推广端 <see>PType</see>
     * @return 操作结果
     * @throws HttpProcessException
     * @throws IOException
     */
    public ReturnDTO unreleaseHouse(AuthDTO authDTO, String houseType, List <Integer> houseIds, Integer pType) throws HttpProcessException, IOException {
        if (houseIds == null || houseIds.size() == 0) {
            throw new IllegalArgumentException("房源id不可为空");
        }
        Map <String, String> header = getHeader(authDTO);
        StringBuilder strHouseids = new StringBuilder();
        for (Integer houseid : houseIds) {
            strHouseids.append(houseid).append(",");
        }
        Map <String, Object> body = new HashMap <>();
        body.put("action", "unreleasehouse");
        body.put("houseType", houseType);
        body.put("houseids", strHouseids);
        body.put("ptype", pType);
        String strResult = super.httpclient.doPost(authDTO.getUrl() + "/house/RealeaseHouse", header, body);
        return JsonHelper.decode(strResult, ReturnDTO.class);
    }

    /**
     * 计算房源的可推广端，没有根据权限，只是单纯的根据房源计算
     *
     * @param houseType  租售类型
     * @param purposeType  物业类型
     * @return  可推广产品ptype列表
     */
    public List <Integer> computeHouseCanReleaseEndpoint(String houseType, String purposeType) {
        List <Integer> list = new LinkedList <>();
        if (PurposeType.SHOP.equals(purposeType)) {
            list.add(PType.SHOP);
        }
        if (PurposeType.OFFICE.equals(purposeType)) {
            list.add(PType.OFFICE);
        }
        if (PurposeType.HOUSE.equals(purposeType) || PurposeType.VALLA.equals(purposeType)) {
            list.add(PType.SFB);
        }
        if ((PurposeType.HOUSE.equals(purposeType) || PurposeType.VALLA.equals(purposeType)) && HouseType.LEASE.equals(houseType)) {
            list.add(PType.ZFB);
        }
        return list;
    }

}
