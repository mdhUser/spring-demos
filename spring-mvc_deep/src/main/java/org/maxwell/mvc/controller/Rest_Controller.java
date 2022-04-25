package org.maxwell.mvc.controller;

import org.maxwell.mvc.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/25 17:08
 */
@RestController
@RequestMapping("/rest")
public class Rest_Controller {


    @GetMapping("/get/{id}")
    public Object getId(@PathVariable String id) {
        System.out.println(id);
        return "getid";
    }

    /**
     *  user
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
        System.out.println(user+" this is one");
        return "post1";
    }

    @GetMapping("/{page}/{pageSize}")
    public Object page(@PathVariable int page,@PathVariable int pageSize){
        System.out.println(page+","+pageSize);
        return "pageDto";
    }


    @DeleteMapping("/{id}")
    public Object delete(@PathVariable int id){
        System.out.println(id);
        return "delete";
    }

    @PutMapping("/{id}")
    public Object put(@PathVariable int id){
        System.out.println(id);
        return "put";
    }

}
