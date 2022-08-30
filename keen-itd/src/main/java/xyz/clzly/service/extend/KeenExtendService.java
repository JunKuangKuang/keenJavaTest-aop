package xyz.clzly.service.extend;

public class KeenExtendService {

    private String name;

    protected int number;

    public KeenExtendService() {
    }

    public KeenExtendService(int num) {
        this.number = num;
    }

    public  void printPro(){
        System.out.println("KeenExtendService.class--------------运行printPro方法");
    }
}
