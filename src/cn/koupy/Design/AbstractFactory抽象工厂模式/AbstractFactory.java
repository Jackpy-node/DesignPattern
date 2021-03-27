package cn.koupy.Design.AbstractFactory抽象工厂模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.AbstractFactory抽象工厂模式
 * @data: 2021-3-27 9:04
 * @discription:
 **/
public interface  AbstractFactory {
    public Shape getShape(String shapeType);
    public Color getColor(String colorType);
}
