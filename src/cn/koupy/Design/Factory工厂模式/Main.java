package cn.koupy.Design.Factory工厂模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.Factory工厂模式
 * @data: 2021-3-27 8:42
 * @discription:
 **/
public class Main {
    public static void main(String[] args) throws Exception {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.Draw();
        shape1 = shapeFactory.getShape("square");
    }
}
