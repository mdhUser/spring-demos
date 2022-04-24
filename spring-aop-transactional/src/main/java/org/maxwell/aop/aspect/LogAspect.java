package org.maxwell.aop.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @description: 日志切面
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/3/25 20:34
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(public String org.maxwell.aop.service.TestService.sout())")
    public void cut() {

    }

    @Before("cut()")
    public void doBefore() {
        System.out.println("advice before=======");
    }

    @AfterReturning(value = "cut()", returning = "result")
    public void doAfterReturning(String result) {
        System.out.println("advice after return = " + result);
    }

    @AfterThrowing(value = "cut()", throwing = "e")
    public void doAfterThrowing(Exception e) {
        System.out.println("advice after throwing= " + e.getMessage());
    }

    @After("cut()")
    public void doAfter(){
        System.out.println("advice finally =======");
    }


}
