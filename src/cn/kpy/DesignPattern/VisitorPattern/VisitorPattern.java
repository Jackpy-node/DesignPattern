package cn.kpy.DesignPattern.VisitorPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.VisitorPattern
 * @data: 2019/3/7 8:45
 * @discription: 访问者模式：元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作
 **/
public class VisitorPattern {
    public static void main(String[] args) {
        //被访问者对象：computer
        Computer computer=new Computer();
        //创建访问者对象实体：new ComputerVisitor()，被访问者通过accept()方法接受了访问者的拜访
        computer.accept(new ComputerVisitor());
    }
}
