package com.fang.openapi.service;

import com.fang.openapi.dto.ReturnGenericDTO;
import com.fang.openapi.dto.agentpower.AgentPowerInfo;
import com.fang.openapi.dto.auth.AuthDTO;
import com.fang.openapi.dto.auth.CompanyKeyUnit;
import com.fang.openapi.http.exception.HttpProcessException;
import com.fang.openapi.util.JsonHelper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 权限相关服务
 * @see <a
 *      href="https://github.com/fangjjy/openapi_document/wiki" target="_blank">参考文档</a>
 * @see AgentPowerManager
 * @author zhangzhiwei
 * @version v2.3.0
 * @create: 2018-08-13 17:47
 */
public class AgentPowerManager extends BaseServiceAbtract {

    public AgentPowerManager(CompanyKeyUnit keyUnit) {
        super(keyUnit);
    }

    /**
     * 权限查询（获取经纪人当前所有权限信息）
     * @param authDTO 授权接口返回数据
     * @return 经纪人当前所有权限信息
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
