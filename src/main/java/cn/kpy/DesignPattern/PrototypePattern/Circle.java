package cn.kpy.DesignPattern.PrototypePattern;

public class Circle extends Shape {
    public Circle() {
        // type的修饰符为protected，所以该属性为子类、父类共享，所以子类直接赋值，父类对象的getType()方法可以获取属性值
        type="Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle Draw !");
    }
}
