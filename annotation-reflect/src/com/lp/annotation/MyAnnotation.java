package com.lp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author lp
 * @since 2022/2/17 20:50
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    //定义注解的参数，一下不为空。需要显示赋值；value可以生路key只有这个
    String name();

    String alias() default "猪猪";//缺省时有默认值
}
