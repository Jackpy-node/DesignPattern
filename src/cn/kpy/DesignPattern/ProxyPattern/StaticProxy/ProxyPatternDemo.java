package cn.kpy.DesignPattern.ProxyPattern.StaticProxy;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.VisitorPatternDemo
 * @data: 2019/3/7 8:38
 * @discription: 静态代理模式
 **/
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image=new ProxyImage("test.jpg");
        //第一次调用需要从磁盘加载文件
        image.ShowImage();
        //第二次因为代理模式调用的是其他对象的方法，第一次是因为对象已经被建立，存在于内存当中，所以直接显示文件内容即可
        image.ShowImage();

    }
}
