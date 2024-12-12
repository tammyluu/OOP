package org.example.libraryaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggingAspect {

    private  static Logger logger = LoggerFactory.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(Log)")
    public  Object Logging(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("Entering method: {} with arguments: {}",methodName , Arrays.toString(args));
        Object result = joinPoint.proceed(args);
        logger.info("Exiting method: {} with result: {} ", methodName , result);
        return result;
    }

}
