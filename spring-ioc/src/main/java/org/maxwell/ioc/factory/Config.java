package org.maxwell.ioc.factory;

import org.maxwell.ioc.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/21 20:00
 */
@Configuration
public class Config {


    @Bean
    public User getUser(){
        return new User();
    }

}
