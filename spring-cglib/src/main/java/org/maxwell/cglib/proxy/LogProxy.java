package org.maxwell.cglib.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/11 20:11
 */
public class LogProxy implements MethodInterceptor {

    private Object target;


    public Object getUserLogProxy(Object target) {

        this.target=target;
        //创建加强器，用来创建动态代理类
        Enhancer enhancer = new Enhancer();
        //为加强器指定要代理的类（目标类）
        enhancer.setSuperclass(this.target.getClass());
        //设置回调方法:对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦
        enhancer.setCallback(this);
        //创建动态代理对象并返回（目标类的加强子类）
        return enhancer.create();

    }


    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        // log - before method
        System.out.println("[before] execute method: " + method.getName());

        Object result=proxy.invokeSuper(object,args);

        // log - after method
        System.out.println("[after] execute method: " + method.getName() + ", return value: " + result);

        return result;
    }
}
