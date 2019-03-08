package cn.kpy.DesignPattern.NullObjectPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.NullObjectPattern
 * @data: 2019/3/6 18:49
 * @discription: 创建对象工厂，根据条件产生实体对象和空对象
 **/
public class CustomerFactory {

    private final static String names[]={"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for(String each_name:names){
            if(each_name.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
