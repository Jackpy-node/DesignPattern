package cn.kpy.DesignPattern.ProxyPattern.CglibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.ProxyPattern.CglibProxy
 * @data: 2019-4-9 8:11
 * @discription: Cglib子类代理工厂，对RealImage在内存中动态创建一个对象
 **/
public class CglibProxyFactory implements MethodInterceptor {

    //维护目标对象
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象创建一个代理对象
    public Object getProxyInstance(){
        //工具类
        Enhancer enhancer=new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象（代理对象）
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务...");
        Object returnValue=method.invoke(target, objects);
        System.out.println("提交事务...");
        return returnValue;
    }
}
