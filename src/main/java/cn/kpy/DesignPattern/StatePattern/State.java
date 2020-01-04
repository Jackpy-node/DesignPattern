package cn.kpy.DesignPattern.StatePattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.StatePattern
 * @data: 2019/3/6 8:52
 * @discription: 允许对象的内部状态改变时改变他的行为，即根据状态改变其行为
 **/
public interface State {
    public abstract void doAction(Context context);
}
