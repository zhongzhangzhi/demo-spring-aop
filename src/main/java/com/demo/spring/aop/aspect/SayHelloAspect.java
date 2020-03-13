package com.demo.spring.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:zhongzhangzhi@xiniaoyun.com">zhongzhangzhi(zhongzhangzhi@xiniaoyun.com)</a>
 */
@Component
@Aspect
@Slf4j
public class SayHelloAspect {

    @Pointcut("execution(* com.demo.spring.aop.service..*(..))")
    public void aspect() {
    }

    @Before("aspect()")
    public void before(JoinPoint point) {

    }

    @After("aspect()")
    public void after(JoinPoint point) {

    }

    @Around("aspect()")
    public void around(JoinPoint point) {

    }

    @AfterReturning("aspect()")
    public void afterReturning(JoinPoint point) {

    }

    @AfterThrowing("aspect()")
    public void afterThrowing(JoinPoint point) {

    }
}
