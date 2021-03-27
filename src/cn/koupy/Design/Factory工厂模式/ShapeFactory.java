package cn.koupy.Design.Factory工厂模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.Factory工厂模式
 * @data: 2021-3-27 8:42
 * @discription:
 **/
public class ShapeFactory {

    public Shape getShape(String shapeType) throws Exception {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else {
            throw new Exception("no such type!!!");
        }
    }
}
