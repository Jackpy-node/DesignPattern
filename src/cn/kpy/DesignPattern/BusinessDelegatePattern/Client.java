package cn.kpy.DesignPattern.BusinessDelegatePattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.BusinessDelegatePattern
 * @data: 2019/3/7 19:26
 * @discription: 创建客户端
 **/
public class Client {
    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    //客户端调用业务代表的方法完成工作
    public void doSomething(){
        businessDelegate.doSomething();
    }
}
