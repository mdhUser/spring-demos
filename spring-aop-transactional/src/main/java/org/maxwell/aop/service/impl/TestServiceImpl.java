package org.maxwell.aop.service.impl;

import org.maxwell.aop.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/24 12:07
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public String sout() throws RuntimeException {

        return "hello aop";
    }

}
