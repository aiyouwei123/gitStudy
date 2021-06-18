package com.java.springboot01.controller;

import com.java.springboot01.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    Person person;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println(person);
        return "hello world";
    }
}
