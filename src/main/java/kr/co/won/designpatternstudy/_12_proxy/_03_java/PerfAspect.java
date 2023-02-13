package kr.co.won.designpatternstudy._12_proxy._03_java;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerfAspect {

    // 적용을 할 곳 정의
    @Around(value = "bean(springGameService)")
    public void timestamp(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("joinPoint = " + joinPoint);
        long before = System.currentTimeMillis();
        joinPoint.proceed();
        System.out.println(System.currentTimeMillis() - before);
//        System.out.println("joinPoint = " + joinPoint);

    }
}
