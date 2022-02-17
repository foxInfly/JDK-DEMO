package com.lp.enumdemo;

/**
 * enum默认继承public abstract class Enum
 * 而Enum默认有name私有属性
 * @author lp
 * @since 2022/2/17 21:04
 */
public enum ElementType {
    PUBLIC,//这里使其就是调用了构造方法，传了name和ordinal
    PRIVATE,
    PROTECTED,
    DEFAULT;

}


