package cn.koupy.Design.Singleton单例模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.Singleton单例模式
 * @data: 2021-3-27 17:02
 * @discription: 静态内部类，推荐使用
 * 是否多线程安全：是
 **/
public class Singleton7 {

    private Singleton7() {

    }

    private static class SINGLETON {
        private static final Singleton7 SINGLETON_7 = new Singleton7();
    }

    public static Singleton7 getSingleton7() {
        return SINGLETON.SINGLETON_7;
    }

    public void showMessage() {
        System.out.println("singleton7 success !");
    }

}
