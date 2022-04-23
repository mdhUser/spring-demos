package org.maxwell.mvc.service.impl;

import org.maxwell.mvc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/23 21:54
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public String test() {
        return "this is test";
    }
}
