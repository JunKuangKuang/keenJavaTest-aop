package xyz.clzly.aspect;


import org.aspectj.lang.annotation.*;

@Aspect
public class KeenAspectWTD {

    @DeclareWarning(value = "call( * xyz.clzly.service.KeenService.unSave())")
    static final String warningCallPrint = "警告！你所调用的unsave方法是不安全的！";

    @DeclareError(value = "call( * xyz.clzly.service.KeenService.unSave())")
    static final String errorCallPrint = "错误！你所调用的unsave方法是不安全的！";

}