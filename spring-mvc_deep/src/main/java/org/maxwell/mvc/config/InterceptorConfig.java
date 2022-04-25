package org.maxwell.mvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/25 23:03
 */

public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private HandlerInterceptor encodingInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截全部路径
        registry.addInterceptor(encodingInterceptor).addPathPatterns("/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
