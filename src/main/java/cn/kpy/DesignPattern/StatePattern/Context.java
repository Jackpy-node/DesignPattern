package cn.kpy.DesignPattern.StatePattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.StatePattern
 * @data: 2019/3/6 18:12
 * @discription: 带有某种状态的类
 **/
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
