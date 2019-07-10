package com.modoo.goods.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  日志打印
 * </p>
 *
 * @author fuzl
 * @date 2019-02-28 13:57
 */
@Aspect
@Component
public class RequestAspect {

    private Logger logger = LoggerFactory.getLogger(RequestAspect.class);

    @Pointcut("execution(public * com.modoo.goods.web..*.*(..))")
    public void log() {
    }

    @Before("log()")
    public void exBefore(JoinPoint joinPoint) {
        ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = sra.getRequest();
        logger.info("url:" + request.getRequestURL());
        logger.info("method:" + request.getMethod());
        logger.info("class method:" + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        if(!ObjectUtils.isEmpty(joinPoint.getArgs())){
            logger.info("args:" + joinPoint.getArgs().toString());
        }
    }

    @After("log()")
    public void exAfter(JoinPoint joinPoint) {
        logger.info("class method:" + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName() + "方法执行完毕！");
    }

    @AfterReturning(returning = "result", pointcut = "log()")
    public void exAfterReturning(Object result) {
        logger.info("执行返回值：" + result.toString());
    }
}
