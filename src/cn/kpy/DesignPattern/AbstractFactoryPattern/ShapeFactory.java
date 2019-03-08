package cn.kpy.DesignPattern.AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        if(shape==null) {
            return null;
        }
        else if(shape.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if(shape.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
