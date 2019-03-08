package cn.kpy.DesignPattern.BusinessDelegatePattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.BusinessDelegatePattern
 * @data: 2019/3/7 19:29
 * @discription:
 **/
public class BusinessDelegatePatternDemo {
    public static void main(String[] args) {

        //业务代表根据业务类型执行不同的业务服务
        BusinessDelegate businessDelegate=new BusinessDelegate("EJB");

        //客户端依赖于服务代表
        Client client=new Client(businessDelegate);

        //客户端工作，客户端调用业务代表的方法对外服务
        client.doSomething();
    }
}
