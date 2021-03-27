package cn.koupy.Design.AbstractFactory抽象工厂模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.AbstractFactory抽象工厂模式
 * @data: 2021-3-27 9:49
 * @discription:
 **/
public class ColorFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if(colorType == null){
            return null;
        } else if(colorType.equalsIgnoreCase("red")){
            return new Red();
        } else if(colorType.equalsIgnoreCase("green")){
            return new Green();
        }
        return null;
    }
}
