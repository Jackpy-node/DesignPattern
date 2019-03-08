package cn.kpy.DesignPattern.BusinessDelegatePattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.BusinessDelegatePattern
 * @data: 2019/3/7 19:23
 * @discription: 创建业务代表
 **/
public class BusinessDelegate {
    private BusinessLookUp businessLookUp=new BusinessLookUp();

    private BusinessService businessService;

    private String ServiceType;

    public BusinessDelegate(String serviceType) {
        ServiceType = serviceType;
    }

    public void doSomething(){
        //业务代表根据业务业务类型的不同，获取不同的业务服务实体
        businessService=businessLookUp.getBusinessService(ServiceType);
        //调用不同业务实体的方法
        businessService.doTask();
    }
}
