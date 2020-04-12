package com.hmx.spring.cloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName EchoController
 * @Description TODO
 * @Author xin
 * @Date 2020/4/10 17:32
 * @Version 1.0
 **/
@RestController
public class EchoController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable("string") String string){
        return "hello Nacos Provider" + string;
    }

    @GetMapping(value = "/lb")
    public String lb(){
        return "Nacos Provider Port" + port;
    }

}
