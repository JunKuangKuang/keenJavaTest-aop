package xyz.clzly.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
/**
 * Created by  君匡on 2021/7/14 9:48
 * 
 * 
 */
@Aspect
public class ThisAndTargetAspect {
    //包括一次KeenService的move方法调用，和两次Animal的move方法调用
    @Pointcut("call(* move(..))")
    public static void pointCutCall() {
    }

    //包括接口Animal,具体类Bird的初始化，Bird对象的初始化和move方法运行，接口方法的调用
    @Pointcut("target(xyz.clzly.service.impl.Bird)")
    public static void pointCutTarget1() {
    }

    //共十个，两个子类各有五个；以Bird为例，类初始化，接口初始化，对象初始化，Animal方法的调用和Bird方法的运行
    @Pointcut("target(xyz.clzly.service.Animal)")
    public static void pointCutTarget2() {
    }

    //共六个，类的初始化，类对象初始化，两个方法分别的调用和运行
    @Pointcut("target(xyz.clzly.service.KeenService)")
    public static void pointCutTarget3() {
    }
    
    //包括接口Animal,具体类Bird的初始化,Bird对象的初始化和move方法运行，加上内部对out的对象获取值对println的调用
    @Pointcut("this(xyz.clzly.service.impl.Bird)")
    public static void pointCutThis1() {
    }

    //共12个，两个子类各六个；以Bird为例，类初始化，接口初始化，对象初始化，move方法的运行，加上内部对out的对象获取值对println的调用
    @Pointcut("this(xyz.clzly.service.Animal)")
    public static void pointCutThis2() {
    }


    //共18个，除去构造，调用和运行，还需要说一句，加上了ArrayList的构造函数调用和List.add(Object)方法的调用
    @Pointcut("this(xyz.clzly.service.KeenService)")
    public static void pointCutThis3() {
    }
    /*
    开始组合！
    */
    //call(void xyz.clzly.service.Animal.move())
    @Pointcut("pointCutCall() && pointCutTarget1()")
    public static void pointCutCompose1() {
    }

    //call(void xyz.clzly.service.Animal.move()),target对象为：xyz.clzly.service.impl.Bird
    //call(void xyz.clzly.service.Animal.move()),target对象为：xyz.clzly.service.impl.Snake
    @Pointcut("pointCutCall() && pointCutTarget2()")
    public static void pointCutCompose2() {
    }

    //call(void xyz.clzly.service.KeenService.move(List)),target对象为：xyz.clzly.service.KeenService
    @Pointcut("pointCutCall() && pointCutTarget3()")
    public static void pointCutCompose3() {
    }
    
    //一个也没有
    @Pointcut("pointCutCall() && pointCutThis1()")
    public static void pointCutCompose4() {
    }
    //一个也没有
    @Pointcut("pointCutCall() && pointCutThis2()")
    public static void pointCutCompose5() {
    }
    
    //call(void xyz.clzly.service.KeenService.move(List)),this对象为：xyz.clzly.service.KeenService
    //call(void xyz.clzly.service.Animal.move()),this对象为：xyz.clzly.service.KeenService
    //call(void xyz.clzly.service.Animal.move()),this对象为：xyz.clzly.service.KeenService
    @Pointcut("pointCutCall() && pointCutThis3()")
    public static void pointCutCompose6() {
    }

    //依次修改引用，可以慢慢理解
    @Before("pointCutThis1()")
    public void beforeMove(JoinPoint point) {
        System.out.println("抓到切入点为："+point+"所在的限定名"+point.getSourceLocation().getWithinType()+",行数:"+point.getSourceLocation().getLine());
        System.out.println("this对象为："+point.getThis()+",target对象为："+point.getTarget());
    }
}
