package com.lp.reflection;

import com.lp.pojo.Persion;

public class TestClassLoader {
    public static void main(String[] args) {
        ClassLoader classLoader = String.class.getClassLoader();
        ClassLoader classLoader1 = Persion.class.getClassLoader();

        System.out.println(classLoader);
        System.out.println(ClassLoader.getSystemClassLoader());
        System.out.println(ClassLoader.getSystemClassLoader().getParent());
        System.out.println(classLoader1.getClass().getName());
    }
}
