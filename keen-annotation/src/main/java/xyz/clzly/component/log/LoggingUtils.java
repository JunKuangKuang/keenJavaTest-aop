package xyz.clzly.component.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingUtils {
    private static Logger logger = LoggerFactory.getLogger(LoggingUtils.class);

    public static boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    public static boolean isInfoEnabled() {
        return logger.isInfoEnabled();
    }

    public static boolean isErrorEnabled() {
        return logger.isErrorEnabled();
    }

    public static void debug(Class clazz, String msg, Object... args) {
        if (clazz != null) {
            logger = LoggerFactory.getLogger(clazz);
        }
        logger.debug(msg, args);
    }

    public static void info(Class clazz, String msg, Object... args) {
        if (clazz != null) {
            logger = LoggerFactory.getLogger(clazz);
        }
        logger.info(msg, args);
    }

    public static void error(Class clazz, String msg, Object... args) {
        if (clazz != null) {
            logger = LoggerFactory.getLogger(clazz);
        }
        logger.error(msg, args);
    }
}