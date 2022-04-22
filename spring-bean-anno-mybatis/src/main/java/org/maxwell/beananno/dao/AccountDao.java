package org.maxwell.beananno.dao;

import org.apache.ibatis.annotations.Select;
import org.maxwell.beananno.entity.Account;

import java.util.List;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/22 15:29
 */
public interface AccountDao {


    @Select("select * from account")
    List<Account> list();


    Account findOne(long id);



}
