package com.springbootweb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController相当于同时使用@Controller和@ResponseBody注解
@RestController
public class UserController {

    //使用@Value注解注入属性值
    @Value("${vincent.age}")
    private String vincentAge;

    @RequestMapping("/vincent/age")
    public String vincentAge(){
        return vincentAge;
    }

    @RequestMapping("user")
    public String user(){
        return "user";
    }
}
