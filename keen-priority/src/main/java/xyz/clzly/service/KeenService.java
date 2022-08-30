package xyz.clzly.service;

/**
 * Created by  君匡on 2021/7/9 10:28
 */
public class KeenService {
    /**
     * 打印hello world
     */
    public void printHelloWorld(){
        System.out.println("Hello World!");
    }

    /**
     * 两数相除，除数为0会报异常
     */
    public  int div(int a,int b){
        System.out.println("计算"+a+"除"+b+"的结果");
        return a/b;
    }
}
