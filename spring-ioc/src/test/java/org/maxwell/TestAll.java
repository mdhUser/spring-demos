package org.maxwell;

import org.junit.Test;
import org.maxwell.ioc.bean.Admin;
import org.maxwell.ioc.bean.User;
import org.maxwell.ioc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/21 15:04
 */
public class TestAll {


    @Test
    public void testFactory() {

        ApplicationContext context = new ClassPathXmlApplicationContext("factory.xml");

        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);

        UserService userService1 = context.getBean("userService1", UserService.class);
        UserService userService2 = context.getBean("userService1", UserService.class);
        System.out.println(userService1);
        System.out.println(userService2);

    }

    @Test
    public void testDI() {

        ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
        User user = context.getBean("user", User.class);
        User user1 = context.getBean("user1", User.class);
        Admin admin = context.getBean("admin", Admin.class);

        System.out.println(user);
        System.out.println(user1);
        System.out.println(admin);

    }


    @Test
    public void testServiceAndDao() {
        ApplicationContext context = new ClassPathXmlApplicationContext("di.xml", "dao-service.xml");
        UserService userSrevice = context.getBean("userService", UserService.class);
        userSrevice.test();

    }


}
