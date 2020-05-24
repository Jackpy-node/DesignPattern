package cn.koupy.Design.Factory工厂模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.Factory工厂模式
 * @data: 2020-3-17 14:07
 * @discription:
 **/
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.GetShape("circle");
        shape1.Draw();
    }
}
