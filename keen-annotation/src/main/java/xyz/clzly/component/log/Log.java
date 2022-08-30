package xyz.clzly.component.log;

import java.lang.annotation.*;

@Inherited
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Log {
    /**
     * 默认开启日志
     * @return
     */
    boolean printLog() default true;
}