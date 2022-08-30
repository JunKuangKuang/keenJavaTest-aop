package xyz.clzly.keen.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class KeenSpringAspect {
    @Around("execution( * xyz.clzly.service.*.*(..))")
    public Object aroundMethod(ProceedingJoinPoint point){
        Object result = null;
        String methodName = point.getSignature().getName();

        try {
            result = point.proceed();
            System.out.println("返回通知方法>目标方法名" + methodName + ",返回结果为：" + result);
        } catch (Throwable e) {
            /*异常通知方法*/
            System.out.println("异常通知方法>目标方法名" + methodName + ",异常为：" + e);
        }
        return result;
    }
}