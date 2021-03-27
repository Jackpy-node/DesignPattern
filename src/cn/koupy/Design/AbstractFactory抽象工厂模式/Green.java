package cn.koupy.Design.AbstractFactory抽象工厂模式;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.AbstractFactory抽象工厂模式
 * @data: 2021-3-27 9:26
 * @discription:
 **/
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("green color fill()!!!");
    }
}
