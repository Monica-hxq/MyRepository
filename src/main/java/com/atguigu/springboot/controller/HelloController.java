package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloController {

/*    @RequestMapping({"/","/index.html"})
    public String index(){
        return "index";
    }*/

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }


    @RequestMapping("/success")
    public String success(Map<String,Object> map){

        map.put("hello","<h1>你好</h1>");
        //只要我们把HTML页面放在classpath:/templates/，thymeleaf就能自动渲染
        return "success";
    }
}
