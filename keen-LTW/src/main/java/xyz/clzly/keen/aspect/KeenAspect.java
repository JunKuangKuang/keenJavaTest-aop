package xyz.clzly.keen.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class KeenAspect {

    @Around("execution( * xyz.clzly.keen.service.KeenMathService.*(..))")
    public Object aroundSquare(ProceedingJoinPoint point){
        Object result = null;
        String methodName = point.getSignature().getName();
        try {
            System.out.println("11111111111111111111111111" );
            result = point.proceed();

            System.out.println("222222222222222222222222222222");
        } catch (Throwable e) {
            System.out.println("异常通知方法>目标方法名" + methodName + ",异常为：" + e);
        }

        return result;
    }
}