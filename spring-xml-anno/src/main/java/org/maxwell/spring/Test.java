package org.maxwell.spring;

import org.maxwell.spring.service.impl.AppDemoServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/3/22 23:19
 */
public class Test {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("aspects.xml","services.xml","daos.xml");
        AppDemoServiceImpl demoService = context.getBean("demoService", AppDemoServiceImpl.class);

        demoService.doMethod1();
        demoService.doMethod2();
        try {
            demoService.doMethod3();
        } catch (Exception e) {
//            e.printStackTrace();
        }

    }




}