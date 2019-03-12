package cn.kpy.DesignPattern.ServiceLocatorPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.ServiceLocatorPattern
 * @data: 2019/3/12 9:01
 * @discription: 服务定位器（Service Locator） - 服务定位器是通过 JNDI 查找和缓存服务来获取服务的单点接触
 **/
public class ServiceLoader {

    private static Cache cache;

    //通过静态代码块的方式加载缓存
    static {
        cache=new Cache();
    }

    public static Service getService(String serviceName){
        //先去缓存中查找是否已存在service对象，存在时直接返回缓存中的数据
        Service service=cache.getService(serviceName);
        if(service!=null){
            return service;
        }

        //缓存中没有时，通过initialContext查询服务引用，并且将查询到的Service加载到Cache中
        InitialContext initialContext=new InitialContext();
        Service service1= (Service) initialContext.lookup(serviceName);
        cache.addService(service1);
        return service1;
    }
}
