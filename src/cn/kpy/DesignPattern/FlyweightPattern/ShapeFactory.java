package cn.kpy.DesignPattern.FlyweightPattern;

import java.util.HashMap;

public class ShapeFactory {
    private final static HashMap<String,Shape> CircleMap=new HashMap<>();
    public static Shape getCircle(String color){
        Circle circle= (Circle) CircleMap.get(color);
        //线程不安全,通过synchronized关键字实现单例模式，线程安全
        if(circle==null){
            synchronized (ShapeFactory.class) {
                if(circle==null){
                    circle = new Circle(color);
                }
            }
            CircleMap.put(color,circle);
            System.out.println("Creating circle of color："+color);
        }
        return circle;
    }
}
