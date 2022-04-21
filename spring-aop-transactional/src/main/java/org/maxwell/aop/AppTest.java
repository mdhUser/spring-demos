package org.maxwell.aop;

import org.maxwell.aop.config.AppConfig;
import org.maxwell.aop.service.OrderService;
import org.maxwell.aop.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/5 16:20
 */
public class AppTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean("userService",UserService.class);
        OrderService orderService = context.getBean("orderService",OrderService.class);
        orderService.test();
        userService.test3();

    }

}
