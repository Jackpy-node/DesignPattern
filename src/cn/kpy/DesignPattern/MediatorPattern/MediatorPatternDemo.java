package cn.kpy.DesignPattern.MediatorPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.MediatorPattern
 * @data: 2019/3/5 19:08
 * @discription: 中介者模式是用来降低多个对象和类之间的通信复杂性
 **/
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User Robert=new User("robert");
        User John=new User("John");

        Robert.sendMessage("Hi,John !");
        John.sendMessage("Hi,robert !");
    }
}
