package com.practice.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.practice.aop.business.*.*(..))")
    public void dataLayerExecution() {}

    @Pointcut("com.practice.aop.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public void anotherDataLayerExecution() {}

    @Pointcut("bean(*Data*)")
    public void beadDataLayerExecution() {}

    @Pointcut("within(com.practice.aop.business.*)")
    public void otherDataLayerExecution() {}

    @Pointcut("@annotation(com.practice.aop.aspect.TrackTime)")
    public void trackTimeAnnotation() {}

    // can be replicate multiple times for different aspects
    // can be combined with another CommonJointPoint
}
