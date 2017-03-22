package com.lialzm.spring.support;

import java.lang.annotation.*;

/**
 * Created by A on 2017/3/21.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@Documented
public @interface JsonRequest {

    String value() default "";

    boolean required() default true;

}
