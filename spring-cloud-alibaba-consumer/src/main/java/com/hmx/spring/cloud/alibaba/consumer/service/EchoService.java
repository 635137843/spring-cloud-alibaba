package com.hmx.spring.cloud.alibaba.consumer.service;

import com.hmx.spring.cloud.alibaba.consumer.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName EchoService
 * @Description TODO
 * @Author xin
 * @Date 2020/4/10 17:58
 * @Version 1.0
 **/
@FeignClient(name = "service-provider", fallback = EchoServiceFallback.class)
public interface EchoService {

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable("string") String string);

    @GetMapping(value = "/lb")
    public String lb();
}
