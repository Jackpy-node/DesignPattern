package cn.kpy.DesignPattern.NullObjectPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.NullObjectPattern
 * @data: 2019/3/6 18:41
 * @discription: 抽象顾客父类
 **/
public abstract class AbstractCustomer {
    protected String name;
    public abstract boolean IsNull();
    public abstract String getName();
}
