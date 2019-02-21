package com.sptingboot.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/index")
    public String hello() {
        return "你好asdadsadsdasd你好";
    }
}
