package org.maxwell.mvc.config;

import org.maxwell.mvc.interceptor.EncodingInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/25 23:03
 */

public class InterceptorConfig implements WebMvcConfigurer {

    @Bean
    public EncodingInterceptor encodingInterceptor() {
        return new EncodingInterceptor();
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截全部路径
        registry.addInterceptor(encodingInterceptor()).addPathPatterns("/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
