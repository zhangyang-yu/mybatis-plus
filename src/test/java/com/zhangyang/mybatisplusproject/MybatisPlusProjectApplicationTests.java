package com.zhangyang.mybatisplusproject;

import com.zhangyang.mybatisplusproject.entity.CpecBatchAcptInfoEntity;
import com.zhangyang.mybatisplusproject.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusProjectApplicationTests {
    @Autowired
    private  TestService testService;
    @Test
    void contextLoads() {
        List<CpecBatchAcptInfoEntity> cpecBatchAcptInfo = testService.findCpecBatchAcptInfo();
        System.out.println(cpecBatchAcptInfo);
    }
    @Test
    void  test1()
    {
        String id="1394958369676189698";
        System.out.println( testService.findOne(id));

    }

}
