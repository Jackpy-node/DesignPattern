package cn.kpy.DesignPattern.DecoratorPattern;

public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle=new Circle();
        Shape RedCircle=new RedShapeDecorator(new Circle());
        Shape RedRectangle=new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with no border：");
        circle.draw();

        System.out.println("Circle of red border：");
        RedCircle.draw();

        System.out.println("Rectangle of red border：");
        RedRectangle.draw();

    }
}
