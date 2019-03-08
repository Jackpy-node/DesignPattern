package cn.kpy.DesignPattern.BusinessDelegatePattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.BusinessDelegatePattern
 * @data: 2019/3/7 19:17
 * @discription: 创建实体服务EJB，具体业务实现
 **/
public class EJBService implements BusinessService {
    @Override
    public void doTask() {
        System.out.println("Task is EJB service");
    }
}
