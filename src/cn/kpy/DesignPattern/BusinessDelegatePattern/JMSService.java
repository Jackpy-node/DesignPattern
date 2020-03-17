package cn.kpy.DesignPattern.BusinessDelegatePattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.BusinessDelegatePattern
 * @data: 2019/3/7 19:18
 * @discription: 创建服务实体JMS，具体业务实现
 **/
public class JMSService implements BusinessService{
    @Override
    public void doTask() {
        System.out.println("Task is JMS service");
    }
}
