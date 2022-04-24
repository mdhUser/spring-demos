package org.maxwell.aop.service;

import org.aspectj.lang.reflect.NoSuchPointcutException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description 解决事务失效方案
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/5 16:13
 */
@Component
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private LogService logService;


    /**
     * 事务协调员 需放在finally代码块中否则抛出异常无法被调用
     *
     * @throws Exception
     */
    @Transactional(rollbackFor = Exception.class, noRollbackFor = NoSuchPointcutException.class)
    public void test() throws Exception {
        try {
            jdbcTemplate.execute(
                    "INSERT INTO `t_user` ( `username`, `password`, `remark`, `email`) VALUES ( 'Maxwell', 'gda', 'England', 'maxwell@Gmail.com')");
//            int i = 1 / 0;
        } finally {
            logService.log("message1");
        }

    }


}
