package cn.kpy.DesignPattern.ProxyPattern.JDKProxy;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.ProxyPattern.JDKProxy
 * @data: 2019-4-4 8:10
 * @discription: Image接口实现类
 **/
public class RealImage implements Image {
    @Override
    public void ShowImage() {
        System.out.println("Show Image");
    }
}
