package xyz.clzly;


import xyz.clzly.service.KeenPointCutService;

/**
 * Created by  君匡on 2021/7/9 10:24
 */
public class KeenMain {
/*    public static void main(String[] args) {
        KeenService keenService = new KeenService();
        try{
            // No.2 只算div(8,2)的时候，不算Math.addExact(4,4)的时候
            keenService.div(Math.addExact(4,4),0);
        }catch (Throwable throwable){
            //`No.7`
            System.out.println(throwable);
        }

    }*/

    public static void main(String[] args) {
        KeenPointCutService keenPointCutService = new KeenPointCutService();
        try{
            keenPointCutService.div(8,2);
        }catch (Throwable throwable){
            System.out.println(throwable);
        }
    }
}
