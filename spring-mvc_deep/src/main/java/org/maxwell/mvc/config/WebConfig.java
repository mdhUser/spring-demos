package org.maxwell.mvc.config;

import org.maxwell.mvc.interceptor.EncodingInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/25 10:01
 */

@Configuration
@EnableWebMvc
@Import(InterceptorConfig.class)
@ComponentScan({"org.maxwell.mvc.controller"})
public class WebConfig {


    @Bean
    public EncodingInterceptor encodingInterceptor() {
        return new EncodingInterceptor();
    }



}
