package xyz.clzly.aspect;


import xyz.clzly.component.log.LoggingUtils;
import xyz.clzly.component.runTime.RunTime;
import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
public class KeenRunTimeAspect {
    private final static SimpleDateFormat matter = new SimpleDateFormat("yyyy年MM月dd日E HH时mm分ss秒");
    private Date date = null;

    //针对日志注解切面
    @Pointcut("@annotation(xyz.clzly.component.runTime.RunTime)")
    private void runTime() {
    }

    @Around("execution(public * xyz.clzly.service..*(..)) && runTime( )  ")
    public Object aroundMethod(ProceedingJoinPoint point) throws Throwable {
        Object result = null;
        // 获取切入的 Method和注解实例
        MethodSignature joinPointObject = (MethodSignature) point.getSignature();
        Method method = joinPointObject.getMethod();
        RunTime runTimeAnnotation = method.getAnnotation(RunTime.class);
        // 获取参数，类名，方法名
        Object[] args = point.getArgs();
        Class declaringType = joinPointObject.getDeclaringType();
        String methodName = method.getName();

        //注解实例中参数为打印日志
        if (runTimeAnnotation != null && runTimeAnnotation.printRunTime()) {
            try {
                date = new Date();
                //运行 函数并打印日志
                if (LoggingUtils.isInfoEnabled()) {
                    LoggingUtils.info(declaringType, "【方法名为：】{},【开始运行时间为：】{}",
                            new Object[]{methodName, matter.format(date)});
                }
                result = point.proceed();
                if (LoggingUtils.isInfoEnabled()) {
                    LoggingUtils.info(declaringType, "【方法名为：】{},【运行时长为：】{}",
                            new Object[]{methodName, System.currentTimeMillis() - date.getTime() +
                                    "ms"});
                }
            } catch (Throwable throwable) {
                LoggingUtils.error(method.getDeclaringClass(), "【方法名为：】:{},【入参：】：{}, " +
                        "发生系统异常，【异常信息为：】", new Object[]{methodName, 0 == args.length ? "void" :
                        JSON.toJSONString(args), throwable});
                throw throwable;
            }
        } else {
            //参数为不打印日志
            try {
                result = point.proceed();
            } catch (Throwable throwable) {
                throw throwable;
            }
        }
        return result;
    }

}