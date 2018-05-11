package com.ran.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ranbo
 * @version V1.0
 * @Title:
 * @Package com.ran.service
 * @Description:
 * @date 2018/5/11 下午5:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DiagnosisScoreServiceTest {

    @Autowired DiagnosisScoreService diagnosisScoreService;

    @Test public void getAll() {
        System.out.println(diagnosisScoreService.getAll());
    }
}
