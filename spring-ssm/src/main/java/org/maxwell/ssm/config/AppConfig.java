package org.maxwell.ssm.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/27 14:46
 */

@Configuration
@EnableTransactionManagement
@Import({JdbcConfig.class, MybatisConfig.class})
@MapperScan("org.maxwell.ssm.mapper")
@ComponentScan(value = "org.maxwell.ssm",
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
                classes = {RestController.class, Controller.class, RestControllerAdvice.class})})
public class AppConfig {



}
