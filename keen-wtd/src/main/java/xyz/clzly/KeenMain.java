package xyz.clzly;

import xyz.clzly.service.KeenService;

public class KeenMain {
    public static void main(String[] args) {
        KeenService keenService=new KeenService();
        // 如果调用该方法，编译打包会失败
        // 为了测试其他模块，特意将该语句注释
        // keenService.unSave();
    }
}