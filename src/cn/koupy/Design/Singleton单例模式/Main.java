package cn.koupy.Design.Singleton单例模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.Singleton单例模式
 * @data: 2021-3-27 15:40
 * @discription:
 **/
public class Main {
    public static void main(String[] args) {

        System.out.println("--普通饿汉式--");
        Singleton1 singleton1 = Singleton1.getSingleton1();
        singleton1.showMessage();
        singleton1 = Singleton1.getSingleton1();
        singleton1.showMessage();

        System.out.println("\n--静态代码块饿汉式--");
        Singleton2 singleton2 = Singleton2.getSingleton2();
        singleton2.showMessage();
        singleton2 = Singleton2.getSingleton2();
        singleton2.showMessage();

        System.out.println("\n--普通懒汉式--");
        Singleton3 singleton3 = Singleton3.getSingleton3();
        singleton3.showMessage();
        singleton3 = Singleton3.getSingleton3();
        singleton3.showMessage();

        System.out.println("\n--同步方法懒汉式--");
        Singleton4 singleton4 = Singleton4.getSingleton4();
        singleton4.showMessage();
        singleton4 = Singleton4.getSingleton4();
        singleton4.showMessage();

        System.out.println("\n--同步代码块懒汉式--");
        Singleton5 singleton5 = Singleton5.getSingleton5();
        singleton5.showMessage();
        singleton5 = Singleton5.getSingleton5();
        singleton5.showMessage();

        System.out.println("\n--双重锁检查懒汉式--");
        Singleton6 singleton6 = Singleton6.getSingleton6();
        singleton6.showMessage();
        singleton6 = Singleton6.getSingleton6();
        singleton6.showMessage();
    }
}
