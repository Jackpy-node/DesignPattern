package cn.kpy.DesignPattern.PrototypePattern;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap hashMap = new HashMap<String, Shape>();

    public static Shape getShape(String shapeId){
        //每次通过图形的ID获取具体图形时，无需创建新的对象，而是通过克隆复制一个父类对象引用
        try {
            Shape shape = (Shape) hashMap.get(shapeId);
            return (Shape) shape.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    //添加两种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        hashMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        hashMap.put(rectangle.getId(), rectangle);
    }
}
