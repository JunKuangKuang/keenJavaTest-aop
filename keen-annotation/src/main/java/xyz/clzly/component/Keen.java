package xyz.clzly.component;

import java.lang.annotation.*;
/**
 * 只是修改
 * */
@Inherited
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Keen {
    //该注解实例是否禁用
    boolean unable() default false;
    //字符串内容
    String STRING() default "";
}