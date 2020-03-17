package cn.kpy.DesignPattern.ObserverPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.ObserverPattern
 * @data: 2019/3/6 8:19
 * @discription: 具体的观察者类（十六进制观察者类）
 **/
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex Observer：" + Integer.toHexString(subject.getState()));
    }
}
