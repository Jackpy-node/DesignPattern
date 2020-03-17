package cn.kpy.DesignPattern.NullObjectPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.NullObjectPattern
 * @data: 2019/3/6 18:43
 * @discription: 实体类
 **/
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name=name;
    }

    @Override
    public boolean IsNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
