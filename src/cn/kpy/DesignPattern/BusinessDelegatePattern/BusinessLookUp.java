package cn.kpy.DesignPattern.BusinessDelegatePattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.BusinessDelegatePattern
 * @data: 2019/3/7 19:20
 * @discription: 创建业务查询服务
 **/
public class BusinessLookUp {
    public BusinessService getBusinessService(String ServiceType){
        if(ServiceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
