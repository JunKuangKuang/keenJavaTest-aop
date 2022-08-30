package xyz.clzly.service;


/**
 * 原始类，没有成员也没有父类
 */
public class KeenProService implements KeenInterface{
    public void print(){
        System.out.println("原始服务的方法");
    }

    public void printPro() {
        System.out.println("KeenProService.class------------运行原方法");
    }

    // public void print(){
    //     System.out.println("实现接口的方法");
    // }
}
