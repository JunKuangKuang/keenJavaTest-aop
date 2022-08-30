package xyz.clzly.keen.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.clzly.keen.KeenMain;

public class KeenMathService {
    private static Logger logger = LoggerFactory .getLogger(KeenMathService.class);
    /**
     * 求平方，当输入值为非正值时，返回-1
     */
    public int square(int a) {
        if (a <= 0) {
            return -1;
        }
        logger.info("KeenMathService.square");
        // System.out.println("君匡求平方结果为：" + a * a);
        add(a,a);
        return a * a;
    }


    public int add(int a,int b){
        logger.info("KeenMathService.add");
        // System.out.println("君匡求和结果为："+(a+b));
        return a+b;
    }
}