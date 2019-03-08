package cn.kpy.DesignPattern.DecoratorPattern;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw() {
        decoratedShape.draw();//先调用父类draw()方法
        System.out.println("Border Color : red !");//子类特有实现
    }
}
