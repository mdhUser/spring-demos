
package org.maxwell;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.maxwell.beananno.config.AppConfig;
import org.maxwell.beananno.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/22 20:55
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class SPTest {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        System.out.println(userService.findAccount(2));
        userService.findList().forEach(System.out::println);
        System.out.println(userService);
    }

    /**
     *  转账测试
     */
    @Test
    public void test2() {

        userService.moveAccount(1, 2, 100);

    }

}
