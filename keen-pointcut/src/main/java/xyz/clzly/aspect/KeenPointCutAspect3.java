package xyz.clzly.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * Created by  君匡on 2021/7/9 20:17
 * 查看@pointcut所支持的字符串类型
 */
@Aspect

public class KeenPointCutAspect3 {
    //切入点
   /* @Pointcut("within(xyz.clzly.service.KeenPointCutService) && within(!KeenPointCutAspect3)")
    private void pointCut() {}
    

    @Before("pointCut()")//前置通知
    public void beforeDiv(JoinPoint point) {
        System.out.println(point);
        System.out.println("该切入点的类型为："+point.getKind());
    }*/

}
