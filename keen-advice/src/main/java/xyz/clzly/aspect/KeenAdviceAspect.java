package xyz.clzly.aspect;

import xyz.clzly.component.Keen;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by  君匡on 2021/7/9 10:37
 */
@Aspect
public class KeenAdviceAspect {
    //切入点
    @Pointcut("execution(public void xyz.clzly.service.KeenService.printHelloWorld())")
    public void pointCut() {
    }

    //切入点
    @Pointcut("execution(public int xyz.clzly.service.KeenService.div(int,int))")
    public void divPointCut() {
    }


    @Before("pointCut()")//前置通知
    public void beforePrintHelloWorld(JoinPoint joinPoint) {
        System.out.println("前置通知>>你好，世界！");
    }

    @After("pointCut()")//后置通知
    public void afterPrintHelloWorld(JoinPoint joinPoint) {
        System.out.println("后置通知>>你好，世界！");
    }

    // 返回的结果放置在result变量中，在返回通知方法中可以从result变量中获取连接点方法的返回结果了。
    @AfterReturning(value = "divPointCut()", returning = "result")//返回通知
    public void afterReturningDiv(JoinPoint point, Object result) {
        System.out.println("连接点方法为：" + point.getSignature().getName() + ",参数为：" + Arrays.asList(point.getArgs()) + ",执行结果为：" + result);
    }

    // 出现异常信息存储在ex变量中，在异常通知方法中就可以从ex变量中获取异常信息了
    @AfterThrowing(value = "divPointCut()", throwing = "ex")//异常通知
    public void afterThrowingDiv(JoinPoint point, Throwable ex) {
        System.out.println("连接点方法为：" + point.getSignature().getName() + ",参数为：" + Arrays.asList(point.getArgs()) + ",异常为：" + ex);
    }


    @Around("divPointCut()")
    public Object aroundDiv(ProceedingJoinPoint point) {

        // result为连接点的放回结果
        Object result = null;
        String methodName = point.getSignature().getName();

        System.out.println("前置通知方法>目标方法名：" + methodName + ",参数为：" + Arrays.asList(point.getArgs()));
        try {
            // 执行目标方法
            result = point.proceed();
            System.out.println("返回通知方法>目标方法名" + methodName + ",返回结果为：" + result);
        } catch (Throwable e) {
            System.out.println("异常通知方法>目标方法名" + methodName + ",异常为：" + e);
        }finally {
            System.out.println("后置通知方法>目标方法名" + methodName + ",返回结果为：" + result);
        }
        return result;
    }


    //修改传入的参数
    @Around("divPointCut()")
    public Object aroundDiv2(ProceedingJoinPoint point) {
        Object result = null;
        //获取方法参数值数组
        Object[] args = point.getArgs();
        //得到其方法签名
        MethodSignature methodSignature = (MethodSignature) point.getSignature();
        Method method = methodSignature.getMethod();
        // 得到方法名
        String methodName = method.getName();

        // 从方法或者类上面获取注解实例
        Keen keen = null;
        boolean flag = method.isAnnotationPresent(Keen.class);
        if (flag) {
            keen = method.getAnnotation(Keen.class);
        } else {
            // 如果方法上没有注解，则搜索类上是否有注解
            keen = method.getDeclaringClass().getAnnotation(Keen.class);
        }
        if (null != keen) {
            //获得注解的属性
            System.out.println(keen.STRING());
        }


        /*执行目标方法*/
        try {
            //如果调用joinPoint.proceed()方法，则修改的参数值不会生效
            // result = point.proceed();

            args[0] = 6;
            result = point.proceed(args);
            System.out.println("返回通知方法>目标方法名" + methodName + ",返回结果为：" + result);
        } catch (Throwable e) {
            System.out.println("异常通知方法>目标方法名" + methodName + ",异常为：" + e);
        }
        return result;
    }
}
