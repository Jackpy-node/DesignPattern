package cn.kpy.DesignPattern.ProxyPattern.CglibProxy;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.ProxyPattern.CglibProxy
 * @data: 2019-4-9 8:09
 * @discription: 目标对象，没有实现任何接口
 **/
public class RealImage {
    public void ShowImage(){
        System.out.println("Show Image");
    }
}
