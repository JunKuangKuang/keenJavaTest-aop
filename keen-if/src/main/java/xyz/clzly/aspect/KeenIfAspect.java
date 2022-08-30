package xyz.clzly.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by  君匡on 2021/7/22
 * 
 * if判断条件
 */

@Aspect
public class KeenIfAspect {
    static  boolean tracked = true;

    @Pointcut("if()")
    public static   boolean tracked() {
        return tracked;
    }
    @Pointcut("if()")
    public static   boolean systemTime() {
        return System.currentTimeMillis()>300  ;
    }
    @Pointcut("if()")
    public static   boolean joinPointCut(JoinPoint point) {
        // 被除数＞=18就织入，否则就不织入
        int a=(Integer) point.getArgs()[0];
        return a>=18?true:false;
    }
    
    //切入点
    @Pointcut("execution(* xyz.clzly.service.KeenService.div(int,int))")
    public void pointCut() {
    }
    
    @Before("pointCut() && joinPointCut(JoinPoint)")
    public void beforePrintParameter(JoinPoint point) {
        System.out.println("成功织入方法");
    }
}
