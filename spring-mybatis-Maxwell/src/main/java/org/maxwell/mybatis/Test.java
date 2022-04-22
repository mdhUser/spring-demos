package org.maxwell.mybatis;

import org.maxwell.mybatis.config.AppConfig1;
import org.maxwell.mybatis.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/9 22:24
 */
public class Test {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig1.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.test();

    }


}
