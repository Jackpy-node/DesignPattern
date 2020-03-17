package cn.kpy.DesignPattern.VisitorPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.VisitorPatternDemo
 * @data: 2019/3/7 8:38
 * @discription: 电脑类（包含了鼠标和键盘），访问者只要被电脑实体类所接待，则可以访问鼠标和键盘
 **/
public class Computer implements ComputerPart{

    private ComputerPart computerParts[];

    public Computer() {
        computerParts=new ComputerPart[]{new Mouse(),new Keyboard()};
    }

    //只要电脑类接受了访问者的访问，则鼠标、键盘都是电脑的组成部分，均接收访问者的访问
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart computerPart : computerParts) {
            computerPart.accept(computerPartVisitor);
        }
        //访问者被接待之后，对被访对象做出相应处理
        computerPartVisitor.visit(this);
    }
}
