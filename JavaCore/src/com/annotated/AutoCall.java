package com.annotated;

import java.lang.annotation.*;

/**
 * 这个注解是用来自动调用函数使用
 * Created by sxf on 15-3-15.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AutoCall {
    String name();
    String tip() default "";
}