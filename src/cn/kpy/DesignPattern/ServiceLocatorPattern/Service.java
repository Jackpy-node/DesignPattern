package cn.kpy.DesignPattern.ServiceLocatorPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.ServiceLocatorPattern
 * @data: 2019/3/12 8:38
 * @discription: 服务接口（Service） - 实际处理请求的服务。对这种服务的引用可以在 JNDI 服务器中查找到
 **/
public interface Service {
    public abstract String getName();
    public abstract void execute();
}
