package com.xry.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xry_love on 2017/9/24.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {


    @GetMapping("/say")
    public String sayHello(){
        return "hello spring boot";
    }

    @GetMapping
    public String jenkins(){
        return "git jenkins";
    }
}
