package com.ssm.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AccountServiceAop {

    @Before("execution(* com.ssm.service.impl.*.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName());
    }
/*
    @After("execution(* com.ssm.service.impl.*.*(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName());
    }*/

/*
    @Around("execution(* com.ssm.service.impl.*.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("方法前加强");
        Object proceed = pjp.proceed();
        System.out.println("方法后加强");
        return proceed;
    }

    @AfterThrowing("execution(* com.ssm.service.impl.*.*(..))")
    public void afterThrow() throws Throwable {
        System.out.println("出现异常");
    }
*/

}
