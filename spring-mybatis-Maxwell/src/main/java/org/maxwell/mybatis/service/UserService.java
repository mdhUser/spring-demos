package org.maxwell.mybatis.service;

import org.maxwell.mybatis.mapper.OrderMapper;
import org.maxwell.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/9 0:12
 */
@Component
public class UserService {

    /**
     * mybatis 生成一个代理对象 --》bean，但是接口无法生成bean，需要用spring FactoryBean
     */
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrderMapper orderMapper;


    public void test(){
        System.out.println(userMapper.getUserName()+","+orderMapper.getOrderName());
    }


}
