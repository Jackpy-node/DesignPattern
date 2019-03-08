package cn.kpy.DesignPattern.VisitorPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.VisitorPattern
 * @data: 2019/3/7 8:36
 * @discription: 键盘类
 **/
public class Keyboard implements ComputerPart {
    //键盘接受了访问者的访问
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        //访问者被接待之后，对被访对象做出相应处理
        computerPartVisitor.visit(this);
    }
}
