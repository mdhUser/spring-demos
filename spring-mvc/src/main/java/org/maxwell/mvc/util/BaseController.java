package org.maxwell.mvc.util;

import com.alibaba.fastjson.JSON;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/15 13:33
 */
public interface BaseController {

    default public <T> T getBean(HttpServletRequest request,Class<T> clazz) throws IOException {
        InputStream inputStream = request.getInputStream();
        T object = JSON.parseObject(String.valueOf(inputStream), clazz);
        return object;
    }

    default void printJson(HttpServletResponse response,Object o) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        String s = JSON.toJSONString(o);
        response.getWriter().print(s);
    }



}
