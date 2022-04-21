package org.maxwell.caches.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/8 12:18
 */
@Aspect
@Component
public class MaxwellAspect {

    @Pointcut("execution(* org.maxwell.caches.service.AService.*(..))")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void doBefore(){
        System.out.println("this is aspect");
    }


}
