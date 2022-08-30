package xyz.clzly;


import xyz.clzly.service.KeenProService;

/**
 * Created by  君匡on 2021/9/4 10:24
 */
public class KeenMain {
    public static void main(String[] args) {
        KeenProService keenProService = new KeenProService();
        // 调用原对象的原方法，编译器不会报错
        keenProService.printPro();

        // keenProService.KeenProService();

        //给原对象新引入一个接口，强转为接口对象，即可调用，编译器会报错
        // KeenInterface keenInterface = (KeenInterface) keenProService;
        // keenInterface.print();

        // 给新增的字段赋值并且输出，编译器会报错
        // keenProService.setNumber(3);

        // 调用新增的重载方法，编译器会报错
        // keenProService.printPro("keen");

        // keenProService.say();
    }
}