package com.demo.spring.aop.service;

import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:zhongzhangzhi@xiniaoyun.com">zhongzhangzhi(zhongzhangzhi@xiniaoyun.com)</a>
 */
@Service
public class SayHelloService {

    public String sayHello() {
        return "Hello spring aop";
    }
}
