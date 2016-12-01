package com.example.axon.logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingProfiler {

    @Pointcut("execution(* com.example.axon.eventhandling..*(..))")
    public void boundaryMethods() {}

    @Around("boundaryMethods()")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        MDC.put("module", "demo-axon");
        return pjp.proceed();
    }
}
