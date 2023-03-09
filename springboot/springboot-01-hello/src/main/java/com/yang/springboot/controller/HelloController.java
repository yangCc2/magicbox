package com.yang.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: WY
 * @Date: 2023/3/9 14:30
 */
@RestController

/**
 * @RestController =
 * @Controller + @ResponseBody
 */
public class HelloController {

    @RequestMapping("hello")
    public String sayHello(){
        return "Hello Spring Boot 2.x ~";
    }
}
