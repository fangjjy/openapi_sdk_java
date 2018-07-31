package com.fang.openapi.service;

import com.fang.openapi.consts.TestConfig;
import com.fang.openapi.dto.ReturnDTO;
import com.fang.openapi.dto.ReturnGenericDTO;
import com.fang.openapi.dto.auth.AuthDTO;
import com.fang.openapi.dto.auth.CompanyKeyUnit;
import com.fang.openapi.dto.photo.*;
import com.fang.openapi.http.exception.HttpProcessException;
import com.fang.openapi.util.JsonHelper;
import com.fang.openapi.util.StringHelper;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Description: HousePhotoManager 测试
 * author: wjs
 * date: 2018/7/28
 * version: v1.0.0
 */
@SuppressWarnings("ALL")
public class HousePhotoManagerTest {


    private ReturnGenericDTO<AuthDTO> authDTO = null;
    private CompanyKeyUnit keyUnit;
    private HousePhotoManager manager;
    public static Logger logger = LoggerFactory.getLogger(HouseManagerTest.class);

    public HousePhotoManagerTest() {
        this.keyUnit = TestConfig.companyKeyUnit;
        manager = new HousePhotoManager(this.keyUnit);
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
    public void HousePhotoListTest() throws HttpProcessException, IOException {
        try {
            ReturnGenericDTO<List<HousePhotoListDTO>> result = manager
                    .HousePhotoList(authDTO.getData(), "Sale", 224507882);
            System.out.println("HousePhotoList接口" + JsonHelper.encode(result));
        } catch (HttpProcessException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void HousePhotoAddTest() throws HttpProcessException, IOException {
        try {
            HousePhotoAddDTO dto = new HousePhotoAddDTO();
            dto.setAlbumid(5);
            dto.setHouseid(224507882);
            dto.setHouseType("Sale");
            dto.setPhotoname("测试");
            dto.setPhotourl("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1991676905,3908449749&fm=27&gp=0.jpg");
            ReturnDTO result = manager
                    .HousePhotoAdd(authDTO.getData(), dto);
            System.out.println("HousePhotoAdd接口" + JsonHelper.encode(result));
        } catch (HttpProcessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void HousePhotoModifyTest() throws HttpProcessException, IOException {
        try {
            HousePhotoModifyDTO dto = new HousePhotoModifyDTO();
            dto.setHouseid(224507882);
            dto.setHouseType("Sale");
            dto.setPhotoids("1542053");
            dto.setPhotonames("测试改名");
            ReturnDTO result = manager
                    .HousePhotoModify(authDTO.getData(), dto);
            System.out.println("HousePhotoModify接口" + JsonHelper.encode(result));
        } catch (HttpProcessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void HousePhotoDeleteTest() throws HttpProcessException, IOException {
        try {
            HousePhotoDeleteDTO dto = new HousePhotoDeleteDTO();
            dto.setHouseid(224507882);
            dto.setHouseType("Sale");
            dto.setPhotoids("1542053");
            ReturnDTO result = manager
                    .HousePhotoDelete(authDTO.getData(), dto);
            System.out.println("HousePhotoDelete接口" + JsonHelper.encode(result));
        } catch (HttpProcessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void HousePhotoMultAddTest() throws HttpProcessException, IOException {
        try {
            HousePhotoMultAddDTO dto = new HousePhotoMultAddDTO();
            dto.setHouseid(224507882);
            dto.setHouseType("Sale");

            List<HousePhotoDTO> image5 = new ArrayList<HousePhotoDTO>();
            image5.add(new HousePhotoDTO("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1991676905&fm=27&gp=0.jpg",
                    "平面图"));
            dto.setImage5(image5);
            ReturnDTO result = manager
                    .HousePhotoMultAdd(authDTO.getData(), dto);
            System.out.println("HousePhotoMultAdd接口" + JsonHelper.encode(result));
        } catch (HttpProcessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void HouseTitlePictureModifyTest() throws HttpProcessException, IOException {
        try {
            ReturnDTO result = manager
                    .HouseTitlePictureModify(authDTO.getData(),
                            "Sale",
                            "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1991676905,3908449749&fm=27&gp=0.jpg",
                            224507882);
            System.out.println("HouseTitlePictureModify接口" + JsonHelper.encode(result));
        } catch (HttpProcessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ListToStrTest() {
        List<HousePhotoDTO> image5 = new ArrayList<HousePhotoDTO>();
        image5.add(new HousePhotoDTO("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1991676905,3908449749&fm=27&gp=0.jpg",
                "平面图"));
        image5.add(new HousePhotoDTO("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1991676905,3908449749&fm=27&gp=0.jpg",
                "平面图"));
        String ss = StringHelper.strip(image5.toString(), "[]");
        System.out.println("测试toString" + ss);
        String[] SS = ss.split(",");
        String[] bb = SS[0].split("~");
        System.out.println("测试toString" + bb);
    }

}
