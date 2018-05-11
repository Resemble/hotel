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
 * @date 2018/5/11 下午7:57
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MonitorListServiceTest {
    @Autowired MonitorListService monitorListService;

    @Test public void getAll() {
        System.out.println(monitorListService.getAll());
    }
}
