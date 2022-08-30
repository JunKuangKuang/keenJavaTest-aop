package xyz.clzly.exeception;

public class BaseException extends Exception {

    public BaseException(String errMessage) {
        super(errMessage);
    }

    public BaseException(String errMessage, Throwable e) {
        super(errMessage, e);
    }

}
