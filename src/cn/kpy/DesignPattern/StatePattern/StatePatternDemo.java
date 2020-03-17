package cn.kpy.DesignPattern.StatePattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.StatePattern
 * @data: 2019/3/6 18:17
 * @discription: 状态模式：通过向状态类发送消息来改变状态，至于怎么改变，则完全隐藏起来
 **/
public class StatePatternDemo {
    public static void main(String[] args) {
        //具有某种状态的类
        Context context=new Context();

        //定义状态类对象，状态改变时，状态所属对象行为会随之变化
        StartState startState=new StartState();
        //因为状态依赖并属于对象，所以状态的改变其实是context对象状态的改变，而context状态的改变会引起该对象行为的变化
        startState.doAction(context);
        System.out.println(startState.toString());
    }
}
