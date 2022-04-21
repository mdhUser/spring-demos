package org.maxwell.ioc.service.impl;

import org.maxwell.ioc.dao.UserDao;
import org.maxwell.ioc.service.UserService;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/21 15:00
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;


    @Override
    public void test() {
        System.out.println(userDao.findAdmin());
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
