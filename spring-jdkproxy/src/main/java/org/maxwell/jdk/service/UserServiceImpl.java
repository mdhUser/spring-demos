package org.maxwell.jdk.service;

import org.maxwell.jdk.entity.User;

import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/11 20:57
 */
public class UserServiceImpl implements UserService{

    /**
     * find user list.
     *
     * @return user list
     */
    @Override
    public List<User> findUserList() {
        return Collections.singletonList(new User("pdai", 18));
    }

    /**
     * add user
     */
    @Override
    public void addUser() {
        // do something
    }


}
