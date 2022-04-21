package org.maxwell.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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

    @Pointcut("execution(public void org.maxwell.aop.service.UserService.test())")
    public void cut() {

    }

    @Before("cut()")
    public void doBefore(){
        System.out.println("advice before=======");
    }


}
