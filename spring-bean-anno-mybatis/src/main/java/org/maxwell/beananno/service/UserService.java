package org.maxwell.beananno.service;

import org.maxwell.beananno.entity.Account;

import java.util.List;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/22 14:30
 */

public interface UserService {

    /**
     *  搜索列表
     * @return
     */
    List<Account> findList();

    /**
     *  查找帐户
     * @param id
     * @return
     */
    Account findAccount(long id);


}
