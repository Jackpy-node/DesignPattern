package cn.kpy.DesignPattern.VisitorPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.VisitorPatternDemo
 * @data: 2019/3/7 8:29
 * @discription: 访问者接口，定义了想访问电脑的哪部分功能
 **/
public interface ComputerPartVisitor {
    //访问者成功访问之后，根据被访问对象的不同，做出自己不同的处理
    public abstract void visit(Mouse mouse);
    public abstract void visit(Keyboard keyboard);
    public abstract void visit(Computer computer);
}
