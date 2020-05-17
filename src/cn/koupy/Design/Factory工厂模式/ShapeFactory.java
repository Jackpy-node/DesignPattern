package cn.koupy.Design.Factory工厂模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.Factory工厂模式
 * @data: 2020-3-17 11:53
 * @discription: 图形化工厂，根据需求生产不同的产品
 **/
public class ShapeFactory {
    public Shape GetShape(String ShapeType){
        if(ShapeType==null){
            return null;
        }
        else if("Circle".equalsIgnoreCase("circle")){
            return new Circle();
        }
        return null;
    }
}
