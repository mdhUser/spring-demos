package org.maxwell.aop.service;

import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/24 21:06
 */
@Service
public class TestService1 {


    public String test(String str) throws Exception {
        int i = 1 / 0;
        return str;
    }


}
