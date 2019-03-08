package cn.kpy.DesignPattern.MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.MementoPattern
 * @data: 2019/3/5 19:24
 * @discription: 保存备忘节点
 **/
public class CareTaker {
    private List<Memento> mementoList=new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento getMemento(int index){
        return mementoList.get(index);
    }
}
