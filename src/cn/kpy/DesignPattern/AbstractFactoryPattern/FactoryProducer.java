package cn.kpy.DesignPattern.AbstractFactoryPattern;

public class FactoryProducer {
    public AbstractFactory getFactory(String factory){
        if(factory==null){
            return null;
        }
        else if(factory.equalsIgnoreCase("Shape")){
            return new ShapeFactory();
        }
        else if(factory.equalsIgnoreCase("Color")){
            return new ColorFactory();
        }
        return null;
    }
}
