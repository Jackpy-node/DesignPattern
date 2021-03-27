package cn.koupy.Design.AbstractFactory抽象工厂模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.AbstractFactory抽象工厂模式
 * @data: 2021-3-27 9:27
 * @discription:
 **/
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("red color fill()!!!");
    }
}
