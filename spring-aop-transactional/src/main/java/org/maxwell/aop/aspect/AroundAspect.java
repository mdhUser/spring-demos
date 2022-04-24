package org.maxwell.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/24 15:03
 */
@Aspect
@Component
public class AroundAspect {

    @Pointcut("execution(* org.maxwell.aop.service..TestService.*(..))")
    public void pointcut() {
    }


    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {

        Object result = null;
        try {
            System.out.println("advice before ======");
            result = pjp.proceed();
            System.out.println("return=" + result);
            System.out.println("advice after ======");
        } catch (Throwable e) {
            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
        }
        return result;

    }


}
