package com.hmx.spring.cloud.alibaba.consumer.service.fallback;

import com.hmx.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @ClassName EchoServiceFallback
 * @Description TODO
 * @Author xin
 * @Date 2020/4/10 19:26
 * @Version 1.0
 **/
@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo(String string) {
        return "你网络有问题";
    }

    @Override
    public String lb() {
        return "请联系我";
    }
}
