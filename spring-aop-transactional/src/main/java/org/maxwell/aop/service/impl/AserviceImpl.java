package org.maxwell.aop.service.impl;

import org.maxwell.aop.service.Aservice;
import org.maxwell.aop.service.Bservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/24 14:47
 */
@Service
public class AserviceImpl implements Aservice {

    @Autowired
    private Bservice bservice;

}
