package org.maxwell.mvc.servlet; /**
 * @description: ${DESCRIPTION}
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/23 21:46
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.maxwell.mvc.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@WebServlet(name = "BaseServlet", value = "/BaseServlet")
public class BaseServlet extends HttpServlet {

    private AnnotationConfigApplicationContext context;

    @Override
    public void init() throws ServletException {
        System.out.println("=== context init===");
        context = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuffer url = request.getRequestURL();
        String mapping = url.substring(url.lastIndexOf("/") + 1);
        try {

            Field[] fields = this.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(Autowired.class)) {
                    field.setAccessible(true);
                    field.set(this,context.getBean(field.getName()));
                }
            }

            Method method = this.getClass().getMethod(mapping, HttpServletRequest.class, HttpServletResponse.class);
            method.invoke(this, request, response);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    }
}
