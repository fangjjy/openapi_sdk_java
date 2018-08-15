package com.fang.openapi.service;

import com.fang.openapi.dto.ReturnGenericDTO;
import com.fang.openapi.dto.agentpower.AgentPowerInfo;
import com.fang.openapi.dto.auth.AuthDTO;
import com.fang.openapi.dto.auth.CompanyKeyUnit;
import com.fang.openapi.dto.photo.HousePhotoListDTO;
import com.fang.openapi.http.exception.HttpProcessException;
import com.fang.openapi.util.JsonHelper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 权限相关服务
 *
 * @version v1.0.0
 * @author: Songle
 * @create: 2018-08-13 17:47
 **/
public class AgentPowerManager extends BaseServiceAbtract {

    public AgentPowerManager(CompanyKeyUnit keyUnit) {
        super(keyUnit);
    }

    /**
     * 权限查询（获取经纪人当前所有权限信息）
     * @param authDTO
     * @return
     * @throws HttpProcessException
     * @throws IOException
     */
    public ReturnGenericDTO<List<AgentPowerInfo>> getAgentPowerInfo(AuthDTO authDTO) throws HttpProcessException, IOException {
        Map<String, String> header = getHeader(authDTO);
        String result = super.httpclient.doGet(authDTO.getUrl() + "Agent/GetAgentPowerInfo", header,
                null);
        ReturnGenericDTO<List<AgentPowerInfo>> obj = JsonHelper.decode(result,
                new TypeReference<ReturnGenericDTO<List<AgentPowerInfo>>>() {
                });
        return obj;
    }
}
