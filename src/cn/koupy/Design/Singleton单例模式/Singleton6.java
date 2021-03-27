package cn.koupy.Design.Singleton单例模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.Singleton单例模式
 * @data: 2021-3-27 16:45
 * @discription: 双重检查，推荐使用
 * 是否多线程安全：是
 **/
public class Singleton6 {

    private static Singleton6 SINGLETON_6;

    private Singleton6() {

    }

    public static Singleton6 getSingleton6() {
        if (SINGLETON_6 == null) {
            synchronized (Singleton6.class) {
                if(SINGLETON_6==null){
                    System.out.println("create singleton6 success !");
                    SINGLETON_6 = new Singleton6();
                }
            }
        }
        return SINGLETON_6;
    }

    public void showMessage() {
        System.out.println("singleton6 success !");
    }

}
