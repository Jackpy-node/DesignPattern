package cn.kpy.DesignPattern.MementoPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.MementoPattern
 * @data: 2019/3/5 19:27
 * @discription: 备忘录模式应用于数据库事务管理
 **/
public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator=new Originator();
        CareTaker careTaker=new CareTaker();

        originator.setState("state #1");
        originator.setState("state #2");
        careTaker.add(originator.SaveState());
        originator.setState("state #3");
        careTaker.add(originator.SaveState());
        originator.setState("state #4");

        System.out.println("Current state："+originator.getState());
        originator.GetState(careTaker.getMemento(0));
        System.out.println("First Saved state："+originator.getState());
        originator.GetState(careTaker.getMemento(1));
        System.out.println("Second Saved state："+originator.getState());

    }
}
