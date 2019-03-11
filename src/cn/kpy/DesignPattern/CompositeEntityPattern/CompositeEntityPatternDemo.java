package cn.kpy.DesignPattern.CompositeEntityPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.CompositeEntityPattern
 * @data: 2019/3/11 8:55
 * @discription: 用在 EJB 持久化机制中。一个组合实体是一个 EJB 实体 bean，代表了对象的图解。当更新一个组合实体时，内部依赖对象 beans 会自动更新，因为它们是由 EJB 实体 bean 管理的
 **/
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client=new Client();
        client.setData("Test", "Data");
        client.print();
    }
}
