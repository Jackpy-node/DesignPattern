package cn.kpy.DesignPattern.NullObjectPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.NullObjectPattern
 * @data: 2019/3/6 18:57
 * @discription: 空对象模式：一个空对象取代 NULL 对象实例的检查。Null 对象不是检查空值，而是反应一个不做任何动作的关系。这样的 Null 对象也可以在数据不可用的时候提供默认的行为
 **/
public class NullPatternDemo {
    public static void main(String[] args) {
        AbstractCustomer abstractCustomer1 = CustomerFactory.getCustomer("Rob");
        System.out.println("abstractCustomer1：");
        System.out.println("Customer name：" + abstractCustomer1.getName());
        System.out.println("Customer is null ? :" + abstractCustomer1.IsNull());
        AbstractCustomer abstractCustomer2 = CustomerFactory.getCustomer("Lisa");
        System.out.println("abstractCustomer2：");
        System.out.println("Customer name：" + abstractCustomer2.getName());
        System.out.println("Customer is null ? :" + abstractCustomer2.IsNull());
    }
}
