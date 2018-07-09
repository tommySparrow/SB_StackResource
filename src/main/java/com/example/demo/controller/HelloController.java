package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/7/7
 * @ Description：测试类
 * @ throws
 */
@RequestMapping
@ResponseBody
@RestController
public class HelloController {

    @RequestMapping("/sayHi")
    public  String sayHi(){
        System.out.println("123456");
        return "123456";
    }
}
