package cn.koupy.Design.Singleton单例模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.Singleton单例模式
 * @data: 2021-3-27 16:33
 * @discription: 懒汉式，线程安全，同步代码块，不可用
 * 是否多线程安全：是
 **/
public class Singleton5 {

    private static Singleton5 SINGLETON_5;

    private Singleton5() {

    }

    public static Singleton5 getSingleton5() {
        if (SINGLETON_5 == null) {
            synchronized (Singleton5.class) {
                System.out.println("create singleton5 success !");
                SINGLETON_5 = new Singleton5();
            }
        }
        return SINGLETON_5;
    }

    public void showMessage() {
        System.out.println("singleton5 success !");
    }
}
