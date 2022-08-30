package xyz.clzly.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

/**
 * Created by  君匡on 2021/7/22
 * 
 * args传入参数
 */

@Aspect
public class KeenArgsAspect1 {
    //切入点
    @Pointcut(value = "execution(public int xyz.clzly.service.KeenService.div(int,int))")
    public void pointCut() {
    }
    
    @Before(value = "pointCut() && args(a,b)",  argNames = "a,b")
    public void beforePrintParameter(int a, int b) {
        System.out.println("打印参数：" + a + ";" + b);
    }
}
