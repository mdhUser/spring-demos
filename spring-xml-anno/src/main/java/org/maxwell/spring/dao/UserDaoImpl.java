package org.maxwell.spring.dao;

import org.maxwell.spring.bean.User;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/3/22 13:11
 */
@Repository
public class UserDaoImpl {

    public UserDaoImpl() {
    }

    public List<User> findUserList(){
        return Collections.singletonList(new User("mdh",20));
    }

}
