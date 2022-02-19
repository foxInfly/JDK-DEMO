package com.lp.reflection;

import com.lp.pojo.Persion;


/**
 * 获取class的实例
 * 1. Class clazz = Person.class    #最为安全可靠，程序性能最高
 * 2.new Persion().getClass();
 * 3.Class.forName("com.lp.pojo.Persion")
 * 4.内置基本数据类型，直接 类名.Type
 * 5.classloader获取             #底层常用到
 *
 *
 */
public class GetClass {
    public static void main(String[] args) throws Exception{
        test01();

    }

    private static void test01() throws ClassNotFoundException {
        Persion lp = new Persion("lp", 12);
        Class<Persion> clazz1 = Persion.class;
        Class<? extends Persion> clazz2 = lp.getClass();
        Class<?> clazz3 = Class.forName("com.lp.pojo.Persion");

        Class<Integer> type = Integer.TYPE;


        System.out.println(clazz1.hashCode());
        System.out.println(clazz2.hashCode());
        System.out.println(clazz3.hashCode());
    }

}
