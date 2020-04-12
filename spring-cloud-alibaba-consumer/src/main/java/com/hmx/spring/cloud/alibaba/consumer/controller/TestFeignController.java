package com.hmx.spring.cloud.alibaba.consumer.controller;

import com.hmx.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestFeignController
 * @Description TODO
 * @Author xin
 * @Date 2020/4/10 17:57
 * @Version 1.0
 **/

@RefreshScope
@RestController
public class TestFeignController {

    @Autowired
    private EchoService echoService;

    @Value("${user.name}")
    private String username;

    @GetMapping(value = "/feign/echo/{str}")
    public String echo(@PathVariable("str") String str){
        return echoService.echo(str);
    }

    @GetMapping(value = "/feign/echo")
    public String echo(){
        return echoService.echo(username);
    }

    @GetMapping(value = "/lb")
    public String lb(){
        return echoService.lb();
    }
}
