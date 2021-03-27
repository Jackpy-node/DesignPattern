package cn.koupy.Design.AbstractFactory抽象工厂模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.AbstractFactory抽象工厂模式
 * @data: 2021-3-27 9:43
 * @discription:
 **/
public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
