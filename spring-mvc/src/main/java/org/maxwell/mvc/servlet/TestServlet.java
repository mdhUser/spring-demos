package org.maxwell.mvc.servlet;

/**
 * @description: ${DESCRIPTION}
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/23 21:51
 */

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.maxwell.mvc.service.UserService;
import org.maxwell.mvc.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@WebServlet("/test")
@Controller
public class TestServlet extends BaseServlet {

    @Autowired
    private UserService userService;


    public void test(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println(userService);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().print(userService.test());
    }


}
