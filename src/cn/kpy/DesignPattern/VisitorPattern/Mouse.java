package cn.kpy.DesignPattern.VisitorPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.VisitorPattern
 * @data: 2019/3/7 8:33
 * @discription: 鼠标实体类
 **/
public class Mouse implements ComputerPart {

    //鼠标类接受了访问者的访问
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        //访问者调用自己的方法对被访者元素进行操作
        computerPartVisitor.visit(this);
    }
}
