package xyz.clzly;


import xyz.clzly.service.KeenService;

/**
 * Created by  君匡on 2021/7/9 10:24
 */
public class KeenMain {
    public static void main(String[] args) {

        KeenService keenService = new KeenService();
        keenService.div(20,4);
        keenService.div(8,4);
        
    }
}
