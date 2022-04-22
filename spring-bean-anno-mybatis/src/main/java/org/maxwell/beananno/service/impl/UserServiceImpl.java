package org.maxwell.beananno.service.impl;

import org.maxwell.beananno.dao.AccountDao;
import org.maxwell.beananno.entity.Account;
import org.maxwell.beananno.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/22 15:21
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private AccountDao accountDao;


    @Override
    public List<Account> findList() {
        return accountDao.list();
    }


    @Override
    public Account findAccount(long id) {
        return accountDao.findOne(id);
    }
}
