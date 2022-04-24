package org.maxwell.beananno.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.aspectj.lang.annotation.Pointcut;
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


    void outMoney(@Param("uid") int uid, @Param("total") double total);


    void inMoney(@Param("uid") int uid, @Param("total") double total);
}
