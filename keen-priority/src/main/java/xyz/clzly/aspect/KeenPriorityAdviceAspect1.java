package xyz.clzly.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * Created by  君匡on 2021/7/9 20:17
 * 同一个文件相同的切面类型
 */
@Aspect
public class KeenPriorityAdviceAspect1 {
    //切入点
    @Pointcut("execution(public void xyz.clzly.service.KeenService.printHelloWorld())")
    public static void pointCut() {
    }

    /*    @Before("pointCut()")//前置通知
        public void beforePrintHelloWorld2(JoinPoint joinPoint) {
            System.out.println("前置通知2>>你好，世界！");
        }
        @Before("pointCut()")//前置通知
        public void beforePrintHelloWorld1(JoinPoint joinPoint) {
            System.out.println("前置通知1>>你好，世界！");
        }*/
    
    
    /*@After("pointCut()")
    public void afterPrintHelloWorld2(JoinPoint joinPoint) {
        System.out.println("后置通知2>>你好，世界！");
    }
    @After("pointCut()")
    public void afterPrintHelloWorld(JoinPoint joinPoint) {
        System.out.println("后置通知>>你好，世界！");
    }*/

    /*@Around("pointCut()")
    public Object aroundPrintHelloWorld(ProceedingJoinPoint point) {
        Object result = null;
        System.out.println("前置通知方法");
        try {
            result = point.proceed();
        } catch (Throwable e) {
            System.out.println("异常通知方法");
        }finally {
            System.out.println("后置通知方法");
        }
        return result;
    }
    
    @Around("pointCut()")
    public Object aroundPrintHelloWorld2(ProceedingJoinPoint point) {
        Object result = null;
        System.out.println("前置通知方法2");
        try {
            result = point.proceed();
        } catch (Throwable e) {
            System.out.println("异常通知方法2");
        }finally {
            System.out.println("后置通知方法2");
        }
        return result;
    }*/


}
