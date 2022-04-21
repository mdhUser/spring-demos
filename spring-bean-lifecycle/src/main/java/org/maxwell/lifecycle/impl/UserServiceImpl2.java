package org.maxwell.lifecycle.impl;

import org.maxwell.lifecycle.service.UserService;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/21 21:36
 */
public class UserServiceImpl2 implements UserService {
    @Override
    public void test() {
        System.out.println("this is two "+this);
    }

    public void init(){
        System.out.println("init2 run.......");
    }

    public void destroy(){
        System.out.println("destroy2 run.....");
    }



}
