package xyz.clzly.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by  君匡on 2021/7/9 20:17
 * 不同文件，同一个类型
 */
@Aspect
@DeclarePrecedence("KeenPriorityAdviceAspect5,KeenPriorityAdviceAspect4")
public class KeenPriorityAdviceAspect4 {
    @Pointcut("execution(public int xyz.clzly.service.KeenService.div(int,int))")
    public static void pointCut() {
    }
    @Around("pointCut()")
    public Object aroundDiv4(ProceedingJoinPoint point) {
        Object result = null;
        String methodName = point.getSignature().getName();
        System.out.println("around4前置通知方法>目标方法名：" + methodName);
        try {
            result = point.proceed();
        } catch (Throwable e) {
            System.out.println("around4异常通知方法>目标方法名" + methodName + ",异常为：" + e);
        } finally {
            System.out.println("around4后置通知方法>目标方法名" + methodName + ",运行结果为：" + result);
        }
        return result;
    }
}


