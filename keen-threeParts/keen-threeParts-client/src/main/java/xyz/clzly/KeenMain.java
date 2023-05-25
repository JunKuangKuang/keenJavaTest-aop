package xyz.clzly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.clzly.service.KeenService;


public class KeenMain {
    private static Logger logger = LoggerFactory.getLogger(KeenMain.class);
    public static void main(String[] args) {
        logger.info("keen4Main");
        new KeenService().square(3);
    }

    // public static void main(String[] args) {
    //     logger.error("error");
    //     logger.warn("warn");
    //     logger.info("info");
    //     logger.debug("debug");
    //     logger.trace("trace");
    // }
}