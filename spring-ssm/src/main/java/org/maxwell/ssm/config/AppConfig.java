package org.maxwell.ssm.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/27 14:46
 */

@Configuration
@EnableTransactionManagement
@Import({JdbcConfig.class,MybatisConfig.class})
@MapperScan("org.maxwell.ssm.mapper")
@ComponentScan("org.maxwell.ssm.service")
public class AppConfig {






}
