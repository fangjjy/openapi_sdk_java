package com.fang.openapi.service;

import com.fang.openapi.consts.HouseType;
import com.fang.openapi.consts.TestConfig;
import com.fang.openapi.dto.ReturnGenericDTO;
import com.fang.openapi.dto.auth.AuthDTO;
import com.fang.openapi.dto.auth.CompanyKeyUnit;
import com.fang.openapi.dto.house.*;
import com.fang.openapi.dto.photo.HousePhotoDTO;
import com.fang.openapi.http.exception.HttpProcessException;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 房源服务测试类
 */
public class HouseManagerTest {
    private ReturnGenericDTO <AuthDTO> authDTO = null;
    private CompanyKeyUnit keyUnit;
    HouseManager manager;
    public static Logger logger = LoggerFactory.getLogger(HouseManagerTest.class);

    public HouseManagerTest() {
        this.keyUnit = TestConfig.companyKeyUnit;
        manager = new HouseManager(this.keyUnit);
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
    public void save() {
        HouseBaseAbstractDTO dto = getSalehouse();
        try {
            ReturnGenericDTO <HouseReturnDTO> save = manager.save(this.authDTO.getData(), dto, 2);
            System.out.println(save.toString());
        } catch (HttpProcessException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void modify() {
        Integer houseid = 227455121;
        HouseBaseAbstractDTO dto = getSalehouse();
        try {
            ReturnGenericDTO <HouseReturnDTO> save = manager.modify(this.authDTO.getData(), houseid, dto);
            System.out.println(save.toString());
        } catch (HttpProcessException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void list() {
        HouseQueryDTO queryDTO = new HouseQueryDTO();
        try {
            ReturnGenericDTO <HousePageDTO> housePageAbtractDTO = manager.pageList(this.authDTO.getData(), queryDTO);
            System.out.println(housePageAbtractDTO.toString());
            if (housePageAbtractDTO.isSuccess()) {
                HousePageDTO data = housePageAbtractDTO.getData();
                HousePageDTO.HousePageDetailDTO housePageDetailDTO = data.getList().get(1);
                System.out.println(housePageDetailDTO.getHouseId());
            }
        } catch (HttpProcessException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HouseBaseAbstractDTO getLeasehouse() {
        HouseLeaseDTO dto = new HouseLeaseDTO();
        return dto;
    }

    public HouseBaseAbstractDTO getSalehouse() {
        HouseSaleDTO dto = new HouseSaleDTO();
        getBaseHouse(dto);

        dto.setCreateTime("2001-07-06");
        dto.setLiveArea(88.8);
        dto.setBaseService("煤气/天然气,暖气");
        dto.setForward("东北");
        dto.setPayInfo("限价房");
        dto.setLookHouse("随时看房");
        dto.setRoom((short) 2);
        dto.setToilet((short) 1);
        dto.setHall((short) 2);
        dto.setKitchen((short) 1);
        dto.setBalcony((short) 3);
        dto.setFloor((short) 10);
        dto.setFitment("豪华装修");
        dto.setBuildingType("跃层");
        dto.setHouseStructure("平层");
        dto.setPropertySubType("propertysubtype");
        dto.setOwnermentality("业主急售");
        dto.setServiceintroduction("帮过户、贷款");
        dto.setTaxanalysis("税费超级低，只收1.5");
        dto.setCommunitymatching("社区配套");
        dto.setFeature("满五唯一");

        dto.getImage1().add(new HousePhotoDTO("http://img11.soufunimg.com/viewimage/agents/2018_07/20/M1F/0E/5B/ChCE4ltRa_eIWZpAAAEYJaTpm-gABD_EAGO4IkAARg9345/690x440c.jpg", "室内图"));
        dto.getImage1().add(new HousePhotoDTO("http://img11.soufunimg.com/viewimage/agents/2018_07/20/M1F/0E/5B/ChCE4ltRa_eIWZpAAAEYJaTpm-gABD_EAGO4IkAARg9345/690x440c.jpg", "室内图"));
        dto.getImage2().add(new HousePhotoDTO("http://img11.soufunimg.com/viewimage/agents/2018_07/21/M15/0E/63/ChCE4ltSrmKIWdMlAADULOzwLmEABECMAG440AAANRE828/690x440c.jpg", "户外图"));
        return dto;
    }

    public HouseBaseAbstractDTO getSaleValla() {
        VillaSaleDTO dto = new VillaSaleDTO();
        getBaseHouse(dto);
        //22
        dto.setCreateTime("2001-07-06");
        dto.setLiveArea(88.2);
        dto.setBaseService("煤气/天然气,暖气");
        dto.setForward("东北");
        dto.setRoom((short) 2);
        dto.setToilet((short) 1);
        dto.setHall((short) 2);
        dto.setKitchen((short) 1);
        dto.setBalcony((short) 3);
        dto.setFitment("豪华装修");
        dto.setBuildingType("跃层");
        dto.setHouseStructure("平层");
        dto.setOwnermentality("业主急售");
        dto.setServiceintroduction("帮过户、贷款");
        dto.setTaxanalysis("税费超级低，只收1.5");
        dto.setCommunitymatching("社区配套");
        dto.setWorkshopArea(15.6);
        dto.setShopType("半明");
        dto.setSpaceArea(908.0);
        dto.setParkingPlace(2);
        dto.setLookHouse("随时");
        dto.setFeature("满五唯一");
        dto.getImage1().add(new HousePhotoDTO("http://img11.soufunimg.com/viewimage/agents/2018_07/20/M1F/0E/5B/ChCE4ltRa_eIWZpAAAEYJaTpm-gABD_EAGO4IkAARg9345/690x440c.jpg", "室内图"));
        dto.getImage1().add(new HousePhotoDTO("http://img11.soufunimg.com/viewimage/agents/2018_07/20/M1F/0E/5B/ChCE4ltRa_eIWZpAAAEYJaTpm-gABD_EAGO4IkAARg9345/690x440c.jpg", "室内图"));
        dto.getImage2().add(new HousePhotoDTO("http://img11.soufunimg.com/viewimage/agents/2018_07/21/M15/0E/63/ChCE4ltSrmKIWdMlAADULOzwLmEABECMAG440AAANRE828/690x440c.jpg", "户外图"));

        return dto;
    }

    public HouseBaseAbstractDTO getSaleShop() {
        ShopSaleDTO dto = new ShopSaleDTO();
        getBaseHouse(dto);
        dto.setSubType("propertysubtype");
        dto.setPropFee(12.30);
        dto.setFloor((short) 12);
        dto.setIsDivisi(1);
        dto.setFitment("豪华装修");
        dto.setBaseService("电梯");
        dto.setAimOperastion("饭店");
        dto.setFeature("特色");
        return dto;
    }

    public HouseBaseAbstractDTO getSaleOffice() {
        OfficeSaleDTO dto = new OfficeSaleDTO();
        getBaseHouse(dto);
        dto.setSubType("subType");
        dto.setPropFee(11.2);
        dto.setFloor((short) 12);
        dto.setIsDivisi(1);
        dto.setFitment("豪华");
        dto.setPropertyGrade("甲级");
        return dto;
    }

    public HouseBaseAbstractDTO getBaseHouse(HouseBaseAbstractDTO dto) {
        //17
        dto.setNewCode(12132131L);
        dto.setProjName("前程似锦");
        dto.setDistrict("丰台区");
        dto.setComarea("科技园区");
        dto.setAddress("大望路");
        dto.setPrice(300.09);
        dto.setBuildingArea(98.8);
        dto.setInnerId("951357");
        dto.setTitle("好房子大房子低价卖了");
        dto.setInfoCode("9876543");
        dto.setAllFloor((short) 20);
        dto.setPhotoUrl("http://img11.soufunimg.com/viewimage/agents/2018_07/20/M1F/0E/5B/ChCE4ltRa_eIWZpAAAEYJaTpm-gABD_EAGO4IkAARg9345/690x440c.jpg");
        dto.setContent("好房子大房子");
        dto.setTrafficinfo("11路公交");
        dto.setVideoTitle("房源视频");
        dto.setVideoUrl("http://baidu.com");
        dto.setSubwayInfo("电梯，天然气");
        return dto;


    }

    @Test
    public void detail() {
        try {
            ReturnGenericDTO <HouseDetailDTO> deteil = manager.deteil(this.authDTO.getData(), HouseType.SALE, 227455121);
            System.out.println(deteil);
        } catch (HttpProcessException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.trace("trace");

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        System.out.println(format.format(new Date()));
        System.out.println(UUID.randomUUID().toString().replace("-", ""));
        System.out.println(UUID.randomUUID().toString().replace("-", ""));
    }
}