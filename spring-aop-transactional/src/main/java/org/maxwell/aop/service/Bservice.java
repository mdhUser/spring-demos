package org.maxwell.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/8 10:59
 */
@Component
public class Bservice {

    @Autowired
    private Aservice aservice;


}
