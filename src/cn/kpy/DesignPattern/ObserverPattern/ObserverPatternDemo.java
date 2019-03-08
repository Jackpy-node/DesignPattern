package cn.kpy.DesignPattern.ObserverPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.ObserverPattern
 * @data: 2019/3/6 8:23
 * @discription: 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。比如，当一个对象被修改时，则会自动通知它的依赖对象。观察者模式属于行为型模式。
 **/
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexaObserver(subject);

        subject.setState(2);
        System.out.println("Subject：" + subject.getState());
    }
}
