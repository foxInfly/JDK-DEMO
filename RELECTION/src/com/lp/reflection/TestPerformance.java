package com.lp.reflection;

import com.lp.pojo.Persion;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestPerformance {
    public static void main(String[] args) throws Exception {
    test01();
    test02();
    test03();
    
    }

    private static void test01() {
        Persion lp = new Persion("lp", 12);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            lp.getName();
        }
        long end = System.currentTimeMillis();
        System.out.println("普通调用10亿次："+(end -start)+"ms");
    }
    private static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Persion lp = new Persion("lp", 12);
        Method getName = lp.getClass().getDeclaredMethod("getName", null);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(lp,null);
        }
        long end = System.currentTimeMillis();
        System.out.println("普通调用10亿次："+(end -start)+"ms");
    }

    private static void test03() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Persion lp = new Persion("lp", 12);
        Method getName = lp.getClass().getDeclaredMethod("getName", null);
        getName.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(lp,null);
        }
        long end = System.currentTimeMillis();
        System.out.println("普通调用10亿次："+(end -start)+"ms");
    }

}
