package xyz.clzly.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


/**
 * Created by  君匡on 2021/7/22 
 * 演示args和call的区别
 */
@Aspect
public class KeenArgsAspect2 {
    //call(void xyz.clzly.service.KeenService.printString(StringBuffer))
    // call(void java.io.PrintStream.println(Object))
    @Pointcut("args(java.lang.StringBuffer)&& call(* *(..))")
    public void pointCutArgs() {
    }

    //call(void xyz.clzly.service.KeenService.printString(StringBuffer))
    @Pointcut("call(* *(java.lang.StringBuffer))")
    public void pointCutCall() {
    }
    
    @Before("pointCutCall()")
    public void beforePrint(JoinPoint joinPoint) {
        System.out.println("切入点为："+joinPoint);
    }

}
