package cn.kpy.DesignPattern.FactoryPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.FactoryDemo
 * @data: 2019/3/7 8:38
 * @discription: 工厂模式根据所需对象去产生具体的实例对象，所以可以理解为一个会根据传入参数不同产生不同对象的对象工厂
 **/

public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape1=shapeFactory.getShape("Circle");
        shape1.draw();
        Shape shape2=shapeFactory.getShape("Rectangle");
        shape2.draw();
    }
}
