package com.itheima.fescar;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/***
 *
 * @Author:shenkunlin
 * @Description:itheima
 * @date: 2019/3/30 17:19
 *
 ****/
public class AccountTest {


    /***
     * 启动服务
     */
    @Test
    public void testAccount() throws IOException {
        ApplicationContext act = new ClassPathXmlApplicationContext("spring/spring-dubbo.xml");

        //阻塞线程
        System.in.read();
    }
}
