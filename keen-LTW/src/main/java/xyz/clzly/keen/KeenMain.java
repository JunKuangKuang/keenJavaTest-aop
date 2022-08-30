package xyz.clzly.keen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.clzly.keen.service.KeenMathService;

/**
 * Created by  君匡on 2021/6/25 11:24
 */
public class KeenMain {
    private static Logger logger = LoggerFactory.getLogger(KeenMain.class);
    public static void main(String[] args) {
        logger.info("1");
        KeenMathService keenMathService=new KeenMathService();
        logger.info("2");
        keenMathService.square(3);
        logger.info("3");
    }
}
