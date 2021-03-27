package cn.koupy.Design.AbstractFactory抽象工厂模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.AbstractFactory抽象工厂模式
 * @data: 2021-3-27 9:23
 * @discription:
 **/
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("rectangle draw method()!!!");
    }
}
