package xyz.clzly.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class KeenAnnotationAspect {
    // 针对类加keen
    // 运行效果等价于keen-thisandtarget中的切入点xyz.clzly.aspect.ThisAndTargetAspect#pointCutThis1
    @Pointcut("@this(xyz.clzly.component.Keen)")
    public static void pointCutThis() {
    }

    //针对类上面加keen
    // 运行效果等价于keen-thisandtarget中的切入点xyz.clzly.aspect.ThisAndTargetAspect.pointCutTarget1
    @Pointcut("@target(xyz.clzly.component.Keen)")
    public static void pointCutTarget() {
    }


    //针对方法，在传入的类型上面加keen
    //eat方法的调用，eat方法的运行，内部StringBuilder.append方法的调用
    @Pointcut("@args(xyz.clzly.component.Keen)")
    public static void pointCutArgs() {
    }

    //针对类 需要在类上面加keen
    //运行效果等价于keen-point中的切入点xyz.clzly.aspect.KeenPointCutAspect2#AllMethod
    @Pointcut("@within(xyz.clzly.component.Keen)")
    public static void pointCutWithin() {
    }

    // 针对方法，需要在运行方法上加上keen
    @Pointcut("@withincode(xyz.clzly.component.Keen)")
    public static void pointCutWithincode() {
    }

    //依次修改引用，可以慢慢理解
    // @Before(" within(xyz.clzly.service.impl.Snake) && !withincode(* xyz.clzly.service.impl.Snake" +
    //         ".*(..))")
    @Before("within(xyz.clzly.service.impl.Bird)")
    public void beforeMove(JoinPoint point) {
        System.out.println("抓到切入点为：" + point + "所在的限定名" + point.getSourceLocation().getWithinType() + ",行数:" + point.getSourceLocation().getLine());
        System.out.println("this对象为：" + point.getThis() + ",target对象为：" + point.getTarget());
        System.out.println("-------------------------------------");
    }
}
