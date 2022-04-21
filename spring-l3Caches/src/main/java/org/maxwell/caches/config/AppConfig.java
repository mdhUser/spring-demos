package org.maxwell.caches.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/8 12:17
 */
@ComponentScan("org.maxwell.caches")
@EnableAspectJAutoProxy
@EnableAsync
public class AppConfig {


}
