package cn.kpy.DesignPattern.PrototypePattern;

public class Rectangle extends Shape {
    public Rectangle() {
        // type的修饰符为protected，所以该属性为子类、父类共享，所以子类直接赋值，父类对象的getType()方法可以获取属性值
        type="Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Rectangle Draw !");
    }
}
