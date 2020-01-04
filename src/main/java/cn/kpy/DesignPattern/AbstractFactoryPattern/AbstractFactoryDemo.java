package cn.kpy.DesignPattern.AbstractFactoryPattern;

import java.util.Scanner;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String string=scanner.next();
            System.out.println("system in:"+string);
            FactoryProducer factoryProducer=new FactoryProducer();
            AbstractFactory abstractFactory;
            if(string.equalsIgnoreCase("Shape")){
                abstractFactory=factoryProducer.getFactory("Shape");
                Shape shape=abstractFactory.getShape("Circle");
                shape.draw();
            }
            else if(string.equalsIgnoreCase("Color")){
                abstractFactory=factoryProducer.getFactory("Color");
                Color color= abstractFactory.getColor("Red");
                color.fill();
            }
        }
    }
}
