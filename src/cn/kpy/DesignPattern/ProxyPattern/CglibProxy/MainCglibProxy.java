package cn.kpy.DesignPattern.ProxyPattern.CglibProxy;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.ProxyPattern.CglibProxy
 * @data: 2019-4-9 8:27
 * @discription: Cglib代理模式适用于目标对象没有实现接口
 *
 * Cglib子类代理实现方法:
 *      1.需要引入cglib的jar文件,但是Spring的核心包中已经包括了Cglib功能,所以直接引入Spring-core-x.x.x.jar即可.
 *      2.引入功能包后,就可以在内存中动态构建子类
 *      3.代理的类不能为final,否则报错
 *      4.目标对象的方法如果为final/static,那么就不会被拦截,即不会执行目标对象额外的业务方法.
 **/

/**
 * 在Spring的AOP编程中:
 * 如果加入容器的目标对象有实现接口,用JDK代理
 * 如果目标对象没有实现接口,用Cglib代理
 **/

public class MainCglibProxy {
    public static void main(String[] args) {
        //目标对象
        RealImage realImage=new RealImage();
        //代理对象
        RealImage proxyImage= (RealImage) new CglibProxyFactory(realImage).getProxyInstance();
        //执行代理对象方法
        proxyImage.ShowImage();
    }
}
