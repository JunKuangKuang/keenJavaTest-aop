package xyz.clzly.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by  君匡on 2021/7/9 20:17
 * 理解切入点
 */
@Aspect
public class KeenPointCutAspect {
  /*  //切入点
    @Pointcut("execution(public int xyz.clzly.service.KeenService.div(int,int)) ")
    public static void pointCut() {
    }

    @Pointcut("execution( int div(int,int))")
    public static void pointCut2() {
    }


    @Before("pointCut()")
    public void beforeDiv(JoinPoint joinPoint) {
        System.out.println("两数相除");
    }

    @Before("pointCut2()")
    public void beforeDiv2(JoinPoint joinPoint) {
        System.out.println("两数相除2");
    }*/


}
