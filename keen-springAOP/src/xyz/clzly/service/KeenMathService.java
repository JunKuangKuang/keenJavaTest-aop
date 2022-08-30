package xyz.clzly.service;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import xyz.clzly.annotation.KeenTimeRecard;
import xyz.clzly.aspect.KeenSpringTimeRecardAspect;

@Service
public class KeenMathService {
    /**
     * 求平方，当输入值为非正值时，返回-1
     */
    public int square(int a) {
        if (a <= 0) {
            return -1;
        }
        //内联调用成功
        ((KeenMathService) AopContext.currentProxy()).add(a, a);
        return a * a;
    }

    /**
     * 两数相加
     */
    public int add(int a, int b) {
        return a + b;
    }


    @KeenTimeRecard
    public void  keenSpringTimeRecard() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("开始时间为: " + KeenSpringTimeRecardAspect.getStartTime());
    }
}