package org.maxwell;

import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.weaver.ast.Var;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.maxwell.aop.config.AppConfig;
import org.maxwell.aop.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/24 14:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class TestAll {

    @Autowired
    private Aservice aservice;
    @Autowired
    private Bservice bservice;

    @Autowired
    private TestService testService;
    @Autowired
    private TestService1 testService1;
    @Autowired
    private UserService userService;

    /**
     *  循环依赖测试
     */
    @Test
    public void test1() {
        System.out.println(aservice);
        System.out.println(bservice);
    }


    /**
     *  aop test
     */
    @Test
    public void test2() {

        try {
            System.out.println(testService.sout());
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }
    }


    /**
     *  测试事务
     */
    @Test
    public void test3(){

        try {
            userService.test();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *  测试事务传播行为
     */
    @Test
    public void test4(){
        try {
            userService.test();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
