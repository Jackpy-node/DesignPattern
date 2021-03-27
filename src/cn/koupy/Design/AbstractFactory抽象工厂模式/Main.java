package cn.koupy.Design.AbstractFactory抽象工厂模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.AbstractFactory抽象工厂模式
 * @data: 2021-3-27 10:04
 * @discription:
 **/
public class Main {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory abstractFactory = factoryProducer.getFactory("shape");
        Shape shape1 = abstractFactory.getShape("circle");
        shape1.draw();
    }
}
