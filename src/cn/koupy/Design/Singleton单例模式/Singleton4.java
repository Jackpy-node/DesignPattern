package cn.koupy.Design.Singleton单例模式;

import com.sun.source.doctree.SinceTree;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.Singleton单例模式
 * @data: 2021-3-27 16:14
 * @discription: 懒汉式，线程安全，同步方法，不建议使用，效率较低
 *  * 是否多线程安全：是
 **/
public class Singleton4 {

    private static Singleton4 SINGLETON_4;

    private Singleton4(){

    }

    public static synchronized Singleton4 getSingleton4(){
        if(SINGLETON_4 == null){
            SINGLETON_4 = new Singleton4();
        }
        return SINGLETON_4;
    }

}
