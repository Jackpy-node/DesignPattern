package cn.koupy.Design.Singleton单例模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.Singleton单例模式
 * @data: 2021-3-27 15:48
 * @discription: 饿汉式，线程安全
 * 是否多线程安全：是
 **/
public class Singleton2 {

    private static Singleton2 SINGLETON_2;

    private Singleton2() {

    }

    static {
        SINGLETON_2 = new Singleton2();
    }

    public static Singleton2 getSingleton2() {
        System.out.println("create singleton2 success !");
        return SINGLETON_2;
    }

    public void showMessage() {
        System.out.println("singleton2 success !");
    }
}
