package com.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//注意这里已经不是@RestController了，因为需要返回视图，所以不能使用@ResponseBody
@Controller
public class VincentController {
    /*
    * SpringBoot的静态资源默认目录为/static、/public、/resources、和/META-INF/resources
    * SpringBoot默认会按照META/resources > resources > static > public 的优先级寻找对应的资源文件并返回第一个找到的文件
    * */
    @RequestMapping("vincent")
    public String vincent(){
        //对应于vincent.html
        return "vincent";
    }
}
