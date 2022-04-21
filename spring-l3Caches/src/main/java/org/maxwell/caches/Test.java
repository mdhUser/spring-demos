package org.maxwell.caches;

import org.maxwell.caches.config.AppConfig;
import org.maxwell.caches.service.AService;
import org.maxwell.caches.service.BService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/8 12:24
 */
public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AService aService = context.getBean("aService",AService.class);
        BService bService = context.getBean("bService",BService.class);
        aService.test();
        bService.test();

    }

}
