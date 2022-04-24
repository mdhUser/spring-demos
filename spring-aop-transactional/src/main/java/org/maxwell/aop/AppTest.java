package org.maxwell.aop;

import org.maxwell.aop.config.AppConfig;
import org.maxwell.aop.service.TestService;
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
        TestService testService = context.getBean(TestService.class);
        try {
            testService.sout();
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }
        System.out.println();

    }

}
