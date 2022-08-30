package xyz.clzly;


import xyz.clzly.service.KeenService;

/**
 * Created by  君匡on 2021/7/9 10:24
 */
public class KeenMain {
    // 实现接口调用的织入
    /*public static void main(String[] args) {
        // 实际方法调用
        new keenServiceImpl_1().add10(3);
        new keenServiceImpl_2().add10(3);
        // 接口方法调用
        KeenIntrface keenIntrface = new keenServiceImpl_1();
        keenIntrface.add10(3);
        keenIntrface = new keenServiceImpl_2();
        keenIntrface.add10(3);
    }*/

    public static void main(String[] args) {
        KeenService keenService = new KeenService();
        keenService.add1(3);
        keenService.add2(3);
        keenService.add3();
        keenService.print();
    }
}
