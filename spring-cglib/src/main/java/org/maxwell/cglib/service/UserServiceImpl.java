package org.maxwell.cglib.service;

import org.maxwell.cglib.entity.User;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/11 20:17
 */
public class UserServiceImpl {

    /**
     *  findUserList
     * @return
     */
    public List<User> findUserList(){
        System.out.println("[doing] start method");
        return Collections.singletonList(new User("Maxwell",18));
    }

    /**
     *  addUser
     */
    public void addUser(){

    }

}
