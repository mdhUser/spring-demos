package org.maxwell.mvc.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSONObject;
import org.maxwell.mvc.entity.Address;
import org.maxwell.mvc.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/25 17:08
 */
@RestController
@RequestMapping("/rest")
public class RestfulController {


    @GetMapping("/get/{id}")
    public Object getId(@PathVariable String id) {
        System.out.println(id);
        return "getid";
    }

    /**
     * user
     *
     * @param user
     * @return
     */
    @PostMapping("/post")
    public Object getPost(@RequestBody User user) {
        System.out.println(user);
        return "post";
    }

    @PostMapping
    public Object getPost1(@RequestBody User user) {
        System.out.println(user + " this is one");
        return "post1";
    }

    @GetMapping("/{page}/{pageSize}")
    public Object page(@PathVariable int page, @PathVariable int pageSize) {
        System.out.println(page + "," + pageSize);
        return "pageDto";
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable int id) {
        System.out.println(id);
        return "delete";
    }

    @PutMapping("/{id}")
    public Object put(@PathVariable int id) {
        System.out.println(id);
        return "put";
    }

    @GetMapping("/user")
    public Object find(@RequestBody User user) {

        System.out.println(user);
        User user1 = new User();
        Address address = new Address();
        address.setCity("上海");
        address.setCountry("中国");
        user1.setAddress(address);
        return user1;

    }

    @PostMapping("/map")
    public Object map(@RequestBody Map<String, Object> params) {

        String name = (String) params.get("name");
        Integer age = (Integer) params.get("age");
        Address address = (Address) params.get("address");
        System.out.println(address);
        User user = new User();
        user.setAge(age);
        user.setName(name);
        System.out.println(user);

        return "success";
    }


}
