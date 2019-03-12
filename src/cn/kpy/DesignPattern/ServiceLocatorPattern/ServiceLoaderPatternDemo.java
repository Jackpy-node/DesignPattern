package cn.kpy.DesignPattern.ServiceLocatorPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.ServiceLocatorPattern
 * @data: 2019/3/12 9:10
 * @discription:
 **/
public class ServiceLoaderPatternDemo {
    public static void main(String[] args) {
        Service service=ServiceLoader.getService("Service1");
        service.execute();
        service=ServiceLoader.getService("Service2");
        service.execute();
        service=ServiceLoader.getService("Service1");
        service.execute();
        service=ServiceLoader.getService("Service2");
        service.execute();
    }
}
