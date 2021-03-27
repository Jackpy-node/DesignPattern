package cn.koupy.Design.Singleton单例模式;

import java.sql.SQLOutput;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.Singleton单例模式
 * @data: 2021-3-27 15:26
 * @discription: 饿汉式，线程安全
 * 是否多线程安全：是
 **/


public class Singleton1 {

    private static final Singleton1 SINGLETON_1 = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getSingleton1() {
        System.out.println("create singleton1 success !");
        return SINGLETON_1;
    }

    public void showMessage() {
        System.out.println("singleton1 success !");
    }
}
