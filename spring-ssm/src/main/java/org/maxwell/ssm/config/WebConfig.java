package org.maxwell.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/27 14:49
 */

@EnableWebMvc
@Configuration
@ComponentScan({"org.maxwell.ssm.controller", "org.maxwell.ssm.advice"})
public class WebConfig {


}
