package cn.kpy.DesignPattern.ObserverPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.ObserverPattern
 * @data: 2019/3/6 8:05
 * @discription: 观察者
 **/
public abstract class Observer {
    protected Subject subject;//被观察者
    public abstract void update();//该方法用于当被观察者发生变化时，同步更新观察者的行为属性
}
