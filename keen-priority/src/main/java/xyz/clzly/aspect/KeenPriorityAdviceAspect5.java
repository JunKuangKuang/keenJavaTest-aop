package xyz.clzly.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclarePrecedence;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by  君匡on 2021/7/9 20:17
 * 不同文件，同一个类型
 */
@Aspect
@DeclarePrecedence(" xyz.clzly.aspect.KeenPriorityAdviceAspect5, xyz.clzly.aspect.KeenPriorityAdviceAspect4")
public class KeenPriorityAdviceAspect5 {
    @Pointcut("execution(public int xyz.clzly.service.KeenService.div(int,int))")
    public static void pointCut() {
    }
    @Around("pointCut()")
    public Object aroundDiv5(ProceedingJoinPoint point) {
        Object result = null;
        String methodName = point.getSignature().getName();
        System.out.println("around5前置通知方法>目标方法名：" + methodName);
        try {
            result = point.proceed();
        } catch (Throwable e) {
            System.out.println("around5异常通知方法>目标方法名" + methodName + ",异常为：" + e);
        } finally {
            System.out.println("around5后置通知方法>目标方法名" + methodName + ",运行结果为：" + result);
        }
        return result;
    }
}


