package org.maxwell.cglib;

import org.maxwell.cglib.proxy.LogProxy;
import org.maxwell.cglib.service.UserServiceImpl;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/11 20:38
 */
public class CglibDemo {

    public static void main(String[] args) {


        // proxy
        UserServiceImpl userService = (UserServiceImpl) new LogProxy().getUserLogProxy(new UserServiceImpl());

        // call methods
        System.out.println(userService.findUserList());
        userService.addUser();


    }

}
