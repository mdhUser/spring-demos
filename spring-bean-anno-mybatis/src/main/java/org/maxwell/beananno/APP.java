package org.maxwell.beananno;

import org.maxwell.beananno.config.AppConfig;
import org.maxwell.beananno.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/22 20:28
 */
public class APP {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService.findAccount(2));
        userService.findList().forEach(System.out::println);

    }


}
