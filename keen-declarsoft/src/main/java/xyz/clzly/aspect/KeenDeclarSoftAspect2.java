package xyz.clzly.aspect;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class KeenDeclarSoftAspect2 {
    // 如果该切入点发生异常，就进行包装成为自定义异常
    // @AfterThrowing(value="execution(* xyz.clzly.service.KeenService.throwBaseException())",throwing="ex")
    // public void softException(BaseException ex) {
    //     System.out.println("切入点发生自定义异常");
    // }

    // 验证切入点的成功
    // @Before("execution(* xyz.clzly.service.KeenService.throwBaseException())")
    // public void call()
    // {
    //     System.out.println("前置");
    // }
}
