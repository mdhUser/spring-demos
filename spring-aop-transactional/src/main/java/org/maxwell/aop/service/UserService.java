package org.maxwell.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
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


    @Transactional(rollbackFor = Exception.class)
    public void test() {
        jdbcTemplate.execute(
                "INSERT INTO `t_user` ( `username`, `password`, `remark`, `email`) VALUES ( 'ESdsOK哦', 'gfu', '大田国之主', 'hezhiguoco@hdau.com')");
    }

    @Transactional(propagation = Propagation.NEVER, rollbackFor = Exception.class)
    public void test1() {
        jdbcTemplate.execute(
                "INSERT INTO `t_user` ( `username`, `password`, `remark`, `email`) VALUES ( '朱迪', 'dadanj12n', '大明国之主', 'zhudi@daming.com')");
    }

}
