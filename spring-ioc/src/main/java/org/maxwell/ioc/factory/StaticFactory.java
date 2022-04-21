package org.maxwell.ioc.factory;

import org.maxwell.ioc.service.UserService;
import org.maxwell.ioc.service.impl.UserServiceImpl;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/21 14:53
 */
public class StaticFactory {

    public static UserService createBean(){
        return new UserServiceImpl();
    }

}
