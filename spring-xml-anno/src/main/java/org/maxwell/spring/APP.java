package org.maxwell.spring;

import org.maxwell.spring.bean.User;
import org.maxwell.spring.config.AnnotationConfig;
import org.maxwell.spring.service.JdkProxyService;
import org.maxwell.spring.service.impl.CglibProxyDemoServiceImpl;
import org.maxwell.spring.service.impl.JdkProxyServiceImpl;
import org.maxwell.spring.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/3/22 14:23
 */
public class APP {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        UserServiceImpl userService = context.getBean(UserServiceImpl.class);

        List<User> userList = userService.findUserList();

        userList.forEach(System.out::println);
        //getBean（接口类型.class），不能实现类类型，面向接口编程，还要注意此接口只能有一个实现类对象在IOC容器中
        JdkProxyService jdkProxyService = context.getBean(JdkProxyService.class);
        jdkProxyService.doMethod1();
        jdkProxyService.doMethod2();
        try {
            jdkProxyService.doMethod3();
        } catch (Exception e) {
//            e.printStackTrace();
        }
        System.out.println("==============================");
        CglibProxyDemoServiceImpl cglib = context.getBean(CglibProxyDemoServiceImpl.class);
        cglib.doMethod1();
        cglib.doMethod2();
        try {
            cglib.doMethod3();
        } catch (Exception e) {
//            e.printStackTrace();

        }


    }

}



