package com.xdf.dubbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by guxinxin on 2018/8/1.
 */
public class Test {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");

        String name = demoService.getName("---------dubbo----------");
        System.out.println(name);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
