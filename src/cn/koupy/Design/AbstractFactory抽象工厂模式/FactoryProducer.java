package cn.koupy.Design.AbstractFactory抽象工厂模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.AbstractFactory抽象工厂模式
 * @data: 2021-3-27 9:53
 * @discription:
 **/
public class FactoryProducer {
    public AbstractFactory getFactory(String factoryType){
        if(factoryType == null){
            return null;
        } else if(factoryType.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        } else if(factoryType.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}
