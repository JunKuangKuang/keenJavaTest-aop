package xyz.clzly.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//必须作为一个bean能被 Spring 扫描到的同时还是一个aspect切面类
@Component
@Aspect
public class KeenSpringTimeRecardAspect {

    private static ThreadLocal<Long> startTime = new ThreadLocal<>();

    //切面表达式, 从织入效率上还应该加上像 execution 限制
    @Pointcut("@annotation(xyz.clzly.annotation.KeenTimeRecard)")
    //方法名称就是切面签名，凡是被 @KeenTimeRecard 注解的方法都是 keenTimeRecard() 切面
    private void keenTimeRecard() {}

    //进入切面 keenTimeRecard() 之前把当前系统时间存入 startTime, 以备后用v
    @Around("keenTimeRecard()")
    public Object aroundMethod(ProceedingJoinPoint point){
        Object result = null;
        String methodName = point.getSignature().getName();
        startTime.set(System.currentTimeMillis());
        try {
            result = point.proceed();
            System.out.println("返回通知方法>目标方法名:" + methodName + "，返回结果为：" + result + "，运行时长为: " +(System.currentTimeMillis() - startTime.get())+"ms");
        } catch (Throwable e) {
            /*异常通知方法*/
            System.out.println("异常通知方法>目标方法名" + methodName + ",异常为：" + e);
        }
        return result;
    }

    /**
     * 让注解所在方法可以获取变量信息
     */
    public static Long getStartTime() {
        return startTime.get();
    }
}