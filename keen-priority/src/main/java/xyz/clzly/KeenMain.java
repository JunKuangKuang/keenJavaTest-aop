package xyz.clzly;


import xyz.clzly.service.KeenService;

/**
 * Created by  君匡on 2021/7/9 10:24
 */
public class KeenMain {
    public static void main(String[] args) {
        KeenService keenService = new KeenService();
        // keenService.printHelloWorld();
        keenService.div(4,2);
        // keenService.div(4,0);
    }
}
