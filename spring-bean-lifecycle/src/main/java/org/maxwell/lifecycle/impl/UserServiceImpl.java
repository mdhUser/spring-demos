package org.maxwell.lifecycle.impl;

import org.maxwell.lifecycle.service.UserService;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/21 21:35
 */
public class UserServiceImpl implements UserService {

    @Override
    public void test() {
        System.out.println("this is one "+this);
    }

   public void init(){
       System.out.println("init1 run.......");
   }

   public void destroy(){
       System.out.println("destroy1 run.....");
   }

}
