package cn.kpy.DesignPattern.ProxyPattern.JDKProxy;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.ProxyPattern.JDKProxy
 * @data: 2019-4-4 8:45
 * @discription: Proxy 代理模式：代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理，底层通过反射机制实现对象的接口实现
 **/
public class MainJDKProxy {
    public static void main(String[] args) {
        //目标对象，多态，父类引用指向子类对象
        Image target_image=new RealImage();
        //原始类型
        System.out.println(target_image.getClass());
        //给目标对象，创建代理对象，必须通过getProxyInstance()获取代理目标对象实例
        //，此处通过强制类型转换体现代理，因为接口不能new对象，但通过代理模式，代理子类功能，所以父类接口可以调用子类方法
        Image image = (Image) new JDKProxyFactory(target_image).getProxyInstance();
        System.out.println(image.getClass());
        image.ShowImage();
    }
}
