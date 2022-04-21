package org.maxwell.jdk.proxy;

import org.maxwell.jdk.service.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/11 20:58
 */
public class JdkLogProxy {

    private UserService target;

    public JdkLogProxy(UserService target) {
        this.target = target;
    }

    public UserService getJdkLogProxy() {

        Object proxyInstance = Proxy.newProxyInstance(JdkLogProxy.class.getClassLoader(), new Class[]{UserService.class}, (proxy, method, args) -> {
            // log - before method
            System.out.println("[before] execute method: " + method.getName());

            Object result =null;

            try {

                result=method.invoke(target, args);

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

            // log - after method
            System.out.println("[after] execute method: " + method.getName() + ", return value: " + result);
            return result;
        });

        return (UserService) proxyInstance;
    }


}
