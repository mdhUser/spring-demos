package org.maxwell.jdk;

import org.maxwell.jdk.proxy.JdkLogProxy;
import org.maxwell.jdk.service.UserService;
import org.maxwell.jdk.service.UserServiceImpl;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/11 21:23
 */
public class JdkDemo {

    public static void main(String[] args) {

        UserService userService = new JdkLogProxy(new UserServiceImpl()).getJdkLogProxy();

        userService.findUserList();

    }

}
