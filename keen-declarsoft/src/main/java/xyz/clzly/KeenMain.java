package xyz.clzly;

import xyz.clzly.service.KeenService;

public class KeenMain {
    public static void main(String[] args) {
        KeenService keenService=new KeenService();
        System.out.println("此处调用其他方法");
        // try{
        //     // keenService.throwError();
        //     keenService.throwBaseException();
        // }catch (Exception e){
        //     e.printStackTrace();
        // }


        // 编译成功，运行会失败
        // keenService.throwBaseException();
        // 为了方便测试其他模块，故意注释掉该语句
    }
}