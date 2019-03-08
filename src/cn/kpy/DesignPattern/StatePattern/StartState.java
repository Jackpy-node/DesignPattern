package cn.kpy.DesignPattern.StatePattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.StatePattern
 * @data: 2019/3/6 9:07
 * @discription: 定义一个“开始状态”
 **/
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("player is start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
