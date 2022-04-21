package org.maxwell.caches.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/8 12:18
 */
@Component("aService")
public class AService {

    @Autowired
    @Lazy
    private BService bService;

    @Async
    public void test(){
        System.out.println(bService);
    }


}
