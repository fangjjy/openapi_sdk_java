package com.fang.openapi.service;

import com.fang.openapi.consts.TestConfig;
import com.fang.openapi.dto.ReturnGenericDTO;
import com.fang.openapi.dto.agentpower.AgentPowerInfo;
import com.fang.openapi.dto.auth.AuthDTO;
import com.fang.openapi.dto.auth.CompanyKeyUnit;
import com.fang.openapi.dto.house.HouseReturnDTO;
import com.fang.openapi.http.exception.HttpProcessException;
import com.fang.openapi.service.AgentPowerManager;
import com.fang.openapi.service.Auth;
import com.fang.openapi.service.HouseManager;
import com.fang.openapi.service.HouseManagerTest;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class AgentPowerManagerTest {

    private ReturnGenericDTO<AuthDTO> authDTO = null;
    private CompanyKeyUnit keyUnit;
    private AgentPowerManager manager;
    public static Logger logger = LoggerFactory.getLogger(HouseManagerTest.class);

    public AgentPowerManagerTest() {
        this.keyUnit = TestConfig.companyKeyUnit;
        manager = new AgentPowerManager(this.keyUnit);
    }

    @Before
    public void setUp() throws Exception {
        Auth agent = new Auth(this.keyUnit, TestConfig.FangDomain);
        authDTO = agent.applyToken(TestConfig.UserName, TestConfig.UserPassword);
        if (!authDTO.isSuccess()) {
            System.out.println("获取授权失败" + authDTO.getDescription());
        }
    }

    @Test
    public void getAgentPowerInfo() {
        try {
            ReturnGenericDTO <List<AgentPowerInfo>> agentPowerInfo = manager.getAgentPowerInfo(this.authDTO.getData());
            System.out.println(agentPowerInfo.toString());
        } catch (HttpProcessException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}