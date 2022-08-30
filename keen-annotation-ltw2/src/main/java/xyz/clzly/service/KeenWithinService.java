package xyz.clzly.service;

import xyz.clzly.component.Keen;

@Keen
public class KeenWithinService {
    private int KEEN_INT;

    public int getKEEN_INT() {
        //`No.5`
        return KEEN_INT;
    }

    public void setKEEN_INT(int KEEN_INT) {
        //`No.6`
        this.KEEN_INT = KEEN_INT;
    }

    //两个方法都属于No.3
    public KeenWithinService(){
        setKEEN_INT(2);
        // System.out.println("KEEN_INT="+getKEEN_INT());
    }
    public KeenWithinService(int keenInt){
        setKEEN_INT(2);
        // System.out.println("KEEN_INT="+getKEEN_INT());
    }

@Keen
    public  int div(int a,int b) throws Exception {
        //No.1
        System.out.println("计算"+a+"除"+b+"的结果");
        throw new Exception("keen");
        // return a/b;
    }
}