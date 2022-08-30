package xyz.clzly.aspect;


import xyz.clzly.component.log.Log;
import xyz.clzly.component.log.LoggingUtils;
import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

@Aspect
public class KeenLogAspect {

    //针对日志注解切面
    @Pointcut("@annotation(xyz.clzly.component.log.Log)")
    private void log() {
    }

    @Around("execution(* *(..)) && log( )  ")
    public Object aroundMethod(ProceedingJoinPoint point) throws Throwable {
        Object result = null;
        // 获取切入的 Method和注解实例
        MethodSignature joinPointObject = (MethodSignature) point.getSignature();
        Method method = joinPointObject.getMethod();
        Log logAnnotation = method.getAnnotation(xyz.clzly.component.log.Log.class);
        // 获取参数，类名，方法名
        Object[] args = point.getArgs();
        Class declaringType = joinPointObject.getDeclaringType();
        String methodName = method.getName();

        //注解实例中参数为打印日志
        if (logAnnotation != null && logAnnotation.printLog()) {
            try {
                //运行 函数并打印日志
                if (LoggingUtils.isInfoEnabled()) {
                    LoggingUtils.info(declaringType, "【方法名为：】{},【入参：】{}", methodName, 0 == args.length ? "void" : JSON.toJSONString(args));
                }
                result = point.proceed();
                if (LoggingUtils.isInfoEnabled()) {
                    LoggingUtils.info(declaringType, "【方法名为：】{},【出参：】{}", methodName, null == result ? "void" : JSON.toJSONString(result));
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

    //成功切入接口
    // @Around("call(* xyz.clzly.service.KeenIntrface.*(..))&& log( )  ")
    public Object aroundMethod2(ProceedingJoinPoint point) throws Throwable {
        Object result = null;
        // 获取切入的 Method和注解实例
        MethodSignature joinPointObject = (MethodSignature) point.getSignature();
        Method method = joinPointObject.getMethod();
        Log logAnnotation = method.getAnnotation(xyz.clzly.component.log.Log.class);

        //注解实例中参数为打印日志
        if (logAnnotation != null && logAnnotation.printLog()) {
            try {
                //运行 函数并打印日志
                if (LoggingUtils.isInfoEnabled()) {
                    // logger.info("【方法】{},【请求入参】{}",
                    //         point.getSignature().getName(), JSON.toJSONString(point.getArgs()));
                    LoggingUtils.debug(point.getSignature().getDeclaringType(), "【方法】{},【请求入参】{}",
                            point.getSignature().getName(), JSON.toJSONString(point.getArgs()));
                }
                result = point.proceed();
                if (LoggingUtils.isInfoEnabled()) {
                    // logger.info("【方法】{},【返回值】{}",
                    //         point.getSignature().getName(), JSON.toJSONString(result));
                    LoggingUtils.debug(point.getSignature().getDeclaringType(), "【方法】{},【返回值】{}",
                            point.getSignature().getName(), JSON.toJSONString(result));
                }
            } catch (Throwable throwable) {
                LoggingUtils.error(method.getDeclaringClass(), "【方法】:{},【请求入参】：{}, 发生系统异常，【异常信息】", new Object[]{point.getSignature().getName(), JSON.toJSONString(point.getArgs()), throwable});
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