package com.lp.enumdemo;


/**
 * @author lp
 * @since 2022/2/17 20:53
 */

public class TestEnum {
    public static void main(String[] args) {
        ElementType[] values = ElementType.values();
        for (ElementType e: values ) {
            System.out.println(e.name());
        }

        Class<? super ElementType> superclass = ElementType.class.getSuperclass();
        System.out.println(superclass.getName());
    }
}
