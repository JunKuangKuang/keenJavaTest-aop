package xyz.clzly;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.clzly.service.KeenMathService;

public class KeenMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-xml/applicationContext.xml");

        KeenMathService keenMathService = (KeenMathService)applicationContext.getBean("keenMathService");
        keenMathService.square(3);
        keenMathService.keenSpringTimeRecard();
    }
}