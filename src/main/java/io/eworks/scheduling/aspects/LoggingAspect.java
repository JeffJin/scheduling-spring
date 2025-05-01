package io.eworks.scheduling.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
public class LoggingAspect {

    @Before("methodsToBeCalledBeforeServiceAndRepository()")
    public void logBefore(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Entering method " + className + "." + methodName + " with args: " + Arrays.toString(args));
    }

    @AfterReturning(pointcut = "methodsToBeCalledForService()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getName();
        System.out.println("Exiting method " + className + "." + methodName + " with return value: " + result);
    }

    @AfterThrowing(
            pointcut="methodsToBeCalledForService()",
            throwing="ex")
    public void doRecoveryActions(DataAccessException ex) {
        System.out.println("Handling exception " + ex.getMessage());
    }

    @Pointcut("execution(* io.eworks.scheduling.services.*.*(..)) || execution(* io.eworks.scheduling.repositories.*.*(..))")
    public void methodsToBeCalledBeforeServiceAndRepository() {
    }

    @Pointcut("execution(* io.eworks.scheduling.services.*.*(..))")
    public void methodsToBeCalledForService(){
    }
}