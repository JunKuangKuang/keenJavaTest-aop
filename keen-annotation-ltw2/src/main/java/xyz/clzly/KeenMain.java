package xyz.clzly;


import xyz.clzly.service.impl.Snake;

/**
 * Created by  君匡on 2021/7/9 10:24
 */
public class KeenMain {

    public static void main(String[] args) {

        //测试@within
        /*KeenWithinService keenWithinService = new KeenWithinService();
        try{
            // No.2 只算div(8,2)的时候，不算Math.addExact(4,4)的时候
            keenWithinService.div(Math.addExact(4,4),0);
        }catch (Throwable throwable){
            //`No.7`
            System.out.println(throwable);
        }*/

        // 测试@this和@target
        /*new KeenAnimalService().Do();*/

        // 测试@args
        /*Bird bird = new Bird();
        Snake snake = new Snake();
        bird.eat(snake);*/

        //测试@withincode
        new Snake().move();
    }


}
