package org.maxwell.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/3/22 13:28
 */
@Aspect
@EnableAspectJAutoProxy
@Component
public class LogAspect {


    /**
     * define point cut.
     */
    @Pointcut(" execution(* org.maxwell.spring.service..*.*(..))")
    private void pointCut() {

    }


//    @Around("pointCut()")
    public Object businessService(ProceedingJoinPoint pjp) throws Throwable {
        Method method = ((MethodSignature) pjp.getSignature()).getMethod();
        System.out.println("execute method:" + method.getName());
        return pjp.proceed();
    }

    /**
     * 环绕通知
     *
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("pointCut()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("-----------------------");
        System.out.println("环绕通知: 进入方法");
        Object o = pjp.proceed();
        return o;
    }

    /**
     * 前置通知.
     */
    @Before("pointCut()")
    public void doBefore() {
        System.out.println("前置通知");
    }

    /**
     * 后置通知
     *
     * @param result
     */
    @AfterReturning(value = "pointCut()", returning = "result")
    public void doAfterReturning(String result) {
        System.out.println("后置通知, 返回值: " + result);
    }


    /**
     * 异常通知
     * @param e
     */
    @AfterThrowing(value = "pointCut()", throwing = "e")
    public void doAfterThrowing(Exception e) {
        System.out.println("异常通知, 异常: " + e.getMessage());
    }

    /**
     * 最终通知
     */
    @After("pointCut()")
    public void doAfter(){
        System.out.println("最终通知");
    }

}

