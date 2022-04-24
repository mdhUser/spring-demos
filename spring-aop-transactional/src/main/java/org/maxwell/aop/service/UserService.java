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
    public void test() throws Exception {
        jdbcTemplate.execute(
                "INSERT INTO `t_user` ( `username`, `password`, `remark`, `email`) VALUES ( 'Eason', 'gda', '香港', 'edsion@hdau.com')");
    }


    @Transactional(propagation = Propagation.REQUIRES_NEW,
            rollbackFor = Exception.class)
    public void log() {
        jdbcTemplate.execute(
                "INSERT INTO `t_user` ( `username`, `password`, `remark`, `email`) VALUES ( '朱迪', 'dadanj12n', '大明国之主', 'zhudi@daming.com')");
    }

}
