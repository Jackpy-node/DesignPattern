package cn.kpy.DesignPattern.ProxyPattern.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.ProxyPattern.JDKProxy
 * @data: 2019-4-4 8:12
 * @discription: JDK动态代理工厂类，动态代理不需要实现接口,但是需要指定接口类型
 **/
public class JDKProxyFactory implements InvocationHandler{

    //维护一个目标对象
    private Object target;
    public JDKProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        /**
         *static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler h )
         *    注意该方法是在Proxy类中是静态方法,且接收的三个参数依次为:
         *      ClassLoader loader,:指定当前目标对象使用类加载器,获取加载器的方法是固定的
         *      Class<?>[] interfaces,:目标对象实现的接口的类型,使用泛型方式确认类型
         *      InvocationHandler h:事件处理,执行目标对象的方法时,会触发事件处理器的方法,会把当前执行目标对象的方法作为参数传入
         *
         **/
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //开始执行事务2
        System.out.println("开始事务2");
        //执行目标对象方法
        Object object=method.invoke(target, args);
        //提交事务2
        System.out.println("提交事务2");
        return object;
    }
}
