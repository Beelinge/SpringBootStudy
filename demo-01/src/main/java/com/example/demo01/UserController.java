package com.example.demo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private User user;
    @GetMapping("/demo")
    public String demo() {
       return user.getName() + "今年" + user.getAge() + "岁";
    }

    @RequestMapping(value = {"/demo01", "/demo1"}, method = RequestMethod.GET)
    public User demo1() {
        return user;
    }

     /*
    http://localhost:8082/demo2/100
     */
    @RequestMapping(value = "/demo2/{id}", method = RequestMethod.GET)
    public String domo2(@PathVariable("id") Integer id) {
        return "id: " + id;
    }

    /*
    http://localhost:8082/demo3?id=100
     */
    @RequestMapping(value = "/demo3", method = RequestMethod.GET)
    public String demo3(@RequestParam("id")  Integer id) {
        return "id: " + id;
    }

    /*
    defaultValue 默认值
    required    非必传
    http://localhost:8082/demo4?id=100
    */
    @RequestMapping(value = "/demo4", method = RequestMethod.GET)
    public String demo4 (@RequestParam(value = "id", required = false, defaultValue = "0")  Integer id) {
        return "id: " + id;
    }
}
