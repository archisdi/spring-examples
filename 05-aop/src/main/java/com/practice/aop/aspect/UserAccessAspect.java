package com.practice.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // what kind of method call i would intercept
    // execution(* PACKAGE.*.*(..))
    // Weaving & Weaver

    @Before("execution(* com.practice.aop.business.*.*(..))") // . and ..
    public void before(JoinPoint joinPoint) {
        logger.info("Check for user access");
        logger.info("Intercepted Method Call - {}", joinPoint);
    }
}
