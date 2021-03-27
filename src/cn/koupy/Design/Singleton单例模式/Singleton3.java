package cn.koupy.Design.Singleton单例模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.Singleton单例模式
 * @data: 2021-3-27 16:05
 * @discription: 懒汉式，线程不安全
 * 是否多线程安全：否
 **/
public class Singleton3 {

    private static Singleton3 SINGLETON_3;

    private Singleton3(){

    }

    public static Singleton3 getSingleton3(){
        if(SINGLETON_3 == null){
            System.out.println("create singleton3 success !");
            SINGLETON_3 = new Singleton3();
        }
        return SINGLETON_3;
    }

    public void showMessage() {
        System.out.println("singleton3 success !");
    }

}
