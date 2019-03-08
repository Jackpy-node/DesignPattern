package cn.kpy.DesignPattern.MementoPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.MementoPattern
 * @data: 2019/3/5 19:17
 * @discription: 存放备忘信息类
 **/
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
