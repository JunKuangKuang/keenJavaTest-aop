package xyz.clzly.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by  君匡on 2021/7/9 20:17
 * 理解call和execution
 */
@Aspect

public class KeenPointCutAspect2 {
    //切入点
    /*@Pointcut("within(xyz.clzly.service.KeenService) && within(!KeenPointCutAspect2)")
    private void AllMethod() {}

    @Pointcut("call(* xyz.clzly.service..*(..)) && within(!KeenPointCutAspect2)")
    private void AllMethod2() {}
    
    @Pointcut("execution(* xyz.clzly.service..*(..)) && within(!KeenPointCutAspect2)")
    private void AllMethod3() {}
    
    @Around("AllMethod3() ")
    public Object aroundMethod(ProceedingJoinPoint point) {
        Object result = null;
        point.getKind();
        String methodName = point.getSignature().getName();
        try {
            System.out.println("前置通知方法>目标类" + point.getSignature().getDeclaringTypeName()+"目标方法"+methodName+"，切入类型为："+point.getKind());
            result = point.proceed();
        } catch (Throwable e) {
            System.out.println("异常通知方法>目标方法名" + methodName + ",异常为：" + e+point.getSourceLocation());
        }
        return result;
    }
    */




}
