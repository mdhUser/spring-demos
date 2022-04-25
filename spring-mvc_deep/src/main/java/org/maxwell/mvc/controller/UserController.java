package org.maxwell.mvc.controller;

import org.maxwell.mvc.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/25 10:03
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    public Object save() {
        return "Hello MVC !";
    }

    /**
     * @param list
     * @return
     * @RequestParam 必须要从请求参数中获取值不然 400
     * 集合类需要加
     */
    @GetMapping("/listParamForJson")
    public String list(@RequestParam List<String> list) {
        System.out.println(list);
        return "{'module':'list data from json'}";
    }


    @GetMapping("/param")
    public String param(@RequestParam(value = "userName", required = false, defaultValue = "zhangsan")
                        String name, int age) {
        System.out.println(age);
        System.out.println(name);
        return "{'module':'common param'}";
    }

    @GetMapping(value = "/getData")
    public Object getData() {
        return "你好 spring";
    }

    @GetMapping("/getJsonToPojo")
    public Object getJsonToPojo(User user) {
        return user;
    }

    /**
     * JSON反序列成Java对象要加 @RequestBody
     *
     * @param user
     * @return
     */
    @PostMapping(value = "/getJsonToPojo1")
    public Object getJsonToPojo1(@RequestBody User user) {
        return user;
    }


}
