package org.maxwell.beananno.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/22 15:16
 */


@Import(MybatisConfig.class)
@EnableTransactionManagement
@ComponentScan("org.maxwell.beananno")
public class AppConfig {




}


