package com.practice.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAccessAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(
            value = "com.practice.aop.aspect.CommonJoinPointConfig.dataLayerExecution()",
            returning = "result"
    )
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("{} returned with value {}", joinPoint, result);
    }

    // @AfterThrowing, if the method throws error
    // @After, will intercept whether returning of throws
}
