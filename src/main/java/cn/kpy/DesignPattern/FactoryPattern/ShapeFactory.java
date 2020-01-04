package cn.kpy.DesignPattern.FactoryPattern;

public class ShapeFactory {
    /**使用getShape方法获取形状类型的对象*/
    public Shape getShape(String ShapeType){
        if(ShapeType==null){
            return null;
        }
        if(ShapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if(ShapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
