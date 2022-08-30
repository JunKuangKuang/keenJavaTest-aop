package xyz.clzly.aspect;

import xyz.clzly.exeception.BaseException;
public aspect KeenDeclarSoftAspect {


    pointcut executionBasePointCut()
        : execution(* xyz.clzly.service.KeenService.throwBaseException());

    pointcut callBasePointCut()
        : call(* xyz.clzly.service.KeenService.throwBaseException());

    // 验证切入点是可以成功切入的
    //before() : callBasePointCut() {
    //System.out.println("前置通知");
    //}

    //declare soft : Error : call(* xyz.clzly.service.KeenService.throwError());
    declare soft : BaseException : callBasePointCut();
}