package org.maxwell.caches.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/8 12:18
 */
@Component("bService")
public class BService {

    @Autowired
    private AService aService;

    public void test(){
        System.out.println(aService);
    }

}
