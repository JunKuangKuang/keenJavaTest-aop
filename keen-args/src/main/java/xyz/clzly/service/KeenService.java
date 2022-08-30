package xyz.clzly.service;

/**
 * Created by  君匡on 2021/7/9 10:28
 */

public class KeenService {

    /**
     * 打印字符串
     */
    public void printString(StringBuffer str){
        System.out.println(str);
    }
    
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
        System.out.println(a+"除"+b+"结果为："+ a/b);
        return a/b;
    }
}
