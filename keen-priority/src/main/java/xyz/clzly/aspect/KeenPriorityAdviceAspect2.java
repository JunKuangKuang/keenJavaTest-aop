package xyz.clzly.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by  君匡on 2021/7/9 20:17
 * 同一个文件不同的切面类型，服务可以正常执行。
 */
@Aspect
public class KeenPriorityAdviceAspect2 {

    /*@Pointcut("execution(public int xyz.clzly.service.KeenService.div(int,int))")
    public void pointCut() {
    }

    @AfterReturning(value = "pointCut()", returning = "result")//返回通知
    public void afterReturningDiv(JoinPoint point, Object result) {
        System.out.println("返回后置通知，结果为：" + result);
    }

    @After("pointCut()")
    public void afterDiv(JoinPoint joinPoint) {
        System.out.println("后置通知");
    }
    
    @Before("pointCut()")
    public void beforeDiv(JoinPoint joinPoint) {
        System.out.println("前置通知");
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
    public void beforeDiv2(JoinPoint joinPoint) {
        System.out.println("前置通知2");
    }

    @After("pointCut()")
    public void afterDiv2(JoinPoint joinPoint) {
        System.out.println("后置通知2");
    }*/
}


