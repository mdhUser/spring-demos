package org.maxwell.beananno.service.impl;

import org.maxwell.beananno.dao.AccountDao;
import org.maxwell.beananno.entity.Account;
import org.maxwell.beananno.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/22 15:21
 */

@Service
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



    @Transactional(rollbackFor = Exception.class)
    public void moveAccount(int uid1,int uid2, double total) {
        accountDao.outMoney(uid1,total);
        accountDao.inMoney(uid2,total);

    }

}
