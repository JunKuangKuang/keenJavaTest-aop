package xyz.clzly.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by  君匡on 2021/7/9 10:37
 */
@Aspect
public class KeenAspect {
    //切入点
    @Pointcut("execution(public void xyz.clzly.service.KeenService.printHelloWorld())")
    public void pointCut(){}

    @Before("pointCut()")//通知类型 切入点（被选择的连接点）
    public void beforePrintHelloWorld(JoinPoint joinPoint) {//通知内容
        System.out.println("你好，世界！");
    }
}
