package org.maxwell;

import org.junit.Test;
import org.maxwell.lifecycle.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/21 21:40
 */
public class TestBean {

    @Test
    public void testbean() {

        ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        UserService userService1 = context.getBean("userService1", UserService.class);
        UserService userService2 = context.getBean("userService2", UserService.class);

        userService1.test();
        userService2.test();

        ClassPathXmlApplicationContext cac = (ClassPathXmlApplicationContext) context;
        cac.close();
    }


}
