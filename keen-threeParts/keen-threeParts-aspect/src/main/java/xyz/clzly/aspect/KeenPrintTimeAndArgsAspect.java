package xyz.clzly.aspect;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 本文件使用了JDK8的语法！
 *
 * */
@Aspect
public class KeenPrintTimeAndArgsAspect {
    private static Logger logger = LoggerFactory.getLogger(KeenPrintTimeAndArgsAspect.class);

    private final static SimpleDateFormat matter = new SimpleDateFormat("yyyy年MM月dd日E HH时mm分ss秒");
    private Date date = null;

    // 针对日志注解切面
    // @Pointcut("execution(* com.channelsoft.common.service.DataCalcService.*(..))")
    @Pointcut("execution(* xyz.clzly.service.KeenService.square(..))")
    private void printTimeAndArgs() {
    }


    @Around("printTimeAndArgs()")
    public Object aroundMethod(ProceedingJoinPoint point) throws Throwable {
        // logger.info("keenkeen");
        Object result = null;
        // 获取切入的 Method和注解实例
        MethodSignature joinPointObject = (MethodSignature) point.getSignature();

        // 获取参数，类名，方法名
        Method method = joinPointObject.getMethod();
        Object[] args = point.getArgs();
        Class declaringType = joinPointObject.getDeclaringType();
        String methodName = method.getName();

        // 注解实例中参数为打印日志

        try {
            date = new Date();
            // 运行 函数并打印日志
            if (logger.isInfoEnabled()) {
                logger.info("【类和方法名为：】{},【入参：】{},【开始时间：】{}", declaringType.getName()+"#"+methodName, 0 == args.length ? "void" : JSON.toJSONString(args),matter.format(date));
            }


            result = point.proceed();

            if (logger.isInfoEnabled()) {
                logger.info("【类和方法名为：】{},【出参：】{},【运行时长：】{}", declaringType.getName()+"#"+methodName,null == result ? "void" : JSON.toJSONString(result),System.currentTimeMillis() - date.getTime());
            }
        } catch (Throwable throwable) {
            logger.error("【类和方法名为：】:{},【入参：】：{},发生系统异常，【异常信息为：】", methodName, 0 == args.length ? "void" :
                    JSON.toJSONString(args), throwable);
            throw throwable;
        }
        return result;
    }
}