package org.maxwell.scan;

import org.maxwell.scan.service.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/12 11:41
 */
@ComponentScan(value = "org.maxwell.scan", excludeFilters
        = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = UserService.class)})
public class AppConfig {


}
