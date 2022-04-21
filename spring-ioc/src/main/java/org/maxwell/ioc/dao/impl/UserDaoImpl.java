package org.maxwell.ioc.dao.impl;

import org.maxwell.ioc.bean.Admin;
import org.maxwell.ioc.dao.UserDao;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/21 15:54
 */
public class UserDaoImpl implements UserDao {

    private Admin user;


    @Override
    public Admin findAdmin() {
        return user;
    }

    public void setUser(Admin user) {
        this.user = user;
    }
}
