package com.lp.reflection;

import java.util.Arrays;
import java.util.List;

/**
 * 哪些类型可以有class对象？
 * 1.class：外部类，成员（成员内部类，静态内部类），局部内部类，匿名内部类
 * 2.interface
 * 3.数组 int[]
 * 4.enum
 * 5.annotation   @interface
 * 6.基本数据类型(包装类)
 * 7.void
 */
public class GetClassLoadPath {
    public static void main(String[] args) {
        bootstrapClassLoader();
        extClassLoader();
        appClassLoader();

    }

    private static void bootstrapClassLoader() {
//        System.getProperties().list(System.out);
        String property = System.getProperty("sun.boot.class.path");
        List<String> list = Arrays.asList(property.split(":"));
        list.forEach((t) -> {
            System.out.println("启动类加载器目录:" + t);
        });
        System.out.println("=========================");
    }

    private static void extClassLoader() {
//        System.getProperties().list(System.out);
        String property = System.getProperty("java.ext.dirs");
        List<String> list = Arrays.asList(property.split(":"));
        list.forEach((t) -> {
            System.out.println("扩展类加载器目录:" + t);
        });
        System.out.println("=========================");
    }

    private static void appClassLoader() {
//        System.getProperties().list(System.out);
        String property = System.getProperty("java.class.path");
        List<String> list = Arrays.asList(property.split(":"));
        list.forEach((t) -> {
            System.out.println("app类加载器目录:" + t);
        });
        System.out.println("=========================");
    }
}
