package cn.kpy.DesignPattern.ServiceLocatorPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.ServiceLocatorPattern
 * @data: 2019/3/12 8:47
 * @discription: Context / 初始的 Context - JNDI Context 带有对要查找的服务的引用
 **/
public class InitialContext {
    public Object lookup(String serviceName){
        if(serviceName.equalsIgnoreCase("Service1")){
            return new Service1();
        }
        else if(serviceName.equalsIgnoreCase("Service2")){
            return new Service2();
        }
        return null;
    }
}
