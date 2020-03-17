package cn.kpy.DesignPattern.MementoPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.MementoPattern
 * @data: 2019/3/5 19:16
 * @discription: 备忘录原始内容
 **/
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //保存备忘内容
    public Memento SaveState(){
        return new Memento(state);
    }

    //获取备忘内容
    public void GetState(Memento memento){
        state=memento.getState();
    }
}
