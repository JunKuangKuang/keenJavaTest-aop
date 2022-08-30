package xyz.clzly.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * Created by  君匡on 2021/7/9 20:17
 * 同一个文件不同的切面类型，服务抛出了异常。
 */
@Aspect
public class KeenPriorityAdviceAspect3 {

    /*
    @Pointcut("execution(public int xyz.clzly.service.KeenService.div(int,int))")
    public void pointCut() {
    }
    @AfterThrowing(value = "pointCut()", throwing = "ex")//异常通知
    public void afterThrowingDiv(JoinPoint point, Throwable ex) {
        System.out.println("异常通知");
    }
    
    @After("pointCut()")
    public void afterDiv(JoinPoint joinPoint) {
        System.out.println("后置通知");
    }
    
    @Around("pointCut()")
    public Object aroundDiv(ProceedingJoinPoint point) {
        Object result = null;
        String methodName = point.getSignature().getName();
        System.out.println("around前置通知方法>目标方法名：" + methodName);
        try {
            result = point.proceed();
        } catch (Throwable e) {
            System.out.println("around异常通知方法>目标方法名" + methodName + ",异常为：" + e);
        } finally {
            System.out.println("around后置通知方法>目标方法名" + methodName + ",运行结果为：" + result);
        }
        return result;
    }
    @Before("pointCut()")
    public void beforeDiv(JoinPoint joinPoint) {
        System.out.println("前置通知");
    }*/
}


