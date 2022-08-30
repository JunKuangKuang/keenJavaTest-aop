package xyz.clzly.component.runTime;

import java.lang.annotation.*;

@Inherited
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RunTime {
    /**
     * 默认开启打印运行时间
     * @return
     */
    boolean printRunTime() default true;
}