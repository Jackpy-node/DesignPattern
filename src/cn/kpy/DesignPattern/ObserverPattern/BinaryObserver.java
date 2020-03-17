package cn.kpy.DesignPattern.ObserverPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.ObserverPattern
 * @data: 2019/3/6 8:13
 * @discription: 具体的观察者类（二进制观察者类）
 **/
public class BinaryObserver extends Observer {

    //将观察者与被观察者绑定，并且观察者与被观察者存在依赖关系
    public BinaryObserver(Subject subject) {
        this.subject=subject;//观察某个对象
        subject.attach(this);//观察者与被观察者存在依赖关系
    }

    @Override
    public void update() {
        System.out.println("Binary Observer："+Integer.toBinaryString(subject.getState()));
    }
}
