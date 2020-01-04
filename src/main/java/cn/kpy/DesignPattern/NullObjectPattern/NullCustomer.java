package cn.kpy.DesignPattern.NullObjectPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.NullObjectPattern
 * @data: 2019/3/6 18:46
 * @discription: 空对象类
 **/
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean IsNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
