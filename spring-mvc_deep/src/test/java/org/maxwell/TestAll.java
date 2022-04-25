package org.maxwell;

import org.junit.Test;
import org.maxwell.mvc.config.WebConfig;
import org.maxwell.mvc.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/25 10:03
 */
public class TestAll {


    /**
     * 测试扫描器是否必须为配置类
     * <p>
     * answer ： false
     */
    @Test
    public void test() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
        System.out.println(context.getBean(UserController.class));

    }

}
