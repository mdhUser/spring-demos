package org.maxwell.mvc.listener; /**
 * @description: ${DESCRIPTION}
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/23 22:08
 */

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ServletListener implements ServletContextListener {

    public ServletListener() {

    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("===servlet context init===");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        sce.getServletContext().setAttribute("context", context);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("===servlet context destroy===");
    }


}
