package com.practice.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceMetricAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("com.practice.aop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        // startTime = x
        // allow execution of method
        // endTime = y

        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;

        logger.info("Time Taken by {} is {}", joinPoint, timeTaken);
    }
}
