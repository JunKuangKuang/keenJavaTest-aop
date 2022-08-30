package xyz.clzly.service;

import xyz.clzly.exeception.BaseException;

public class KeenService {


    public void throwBaseException() throws BaseException {
        System.out.println("该方法会抛出自定义异常");
        throw new BaseException("抛出自定义异常");
    }

    public void throwError() throws Error {
        System.out.println("该方法会抛出错误");
        throw new Error("抛出错误");
    }


}
