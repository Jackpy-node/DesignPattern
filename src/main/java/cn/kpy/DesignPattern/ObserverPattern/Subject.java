package cn.kpy.DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.ObserverPattern
 * @data: 2019/3/6 8:04
 * @discription: 被观察者，主导对象
 **/
public class Subject {

    private List<Observer> observerList=new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    //当被观察者状态发生改变时，自动唤醒观察者随之做出相应改变
    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
