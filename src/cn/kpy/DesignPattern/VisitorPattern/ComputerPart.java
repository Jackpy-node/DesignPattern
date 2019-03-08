package cn.kpy.DesignPattern.VisitorPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.VisitorPatternDemo
 * @data: 2019/3/7 8:28
 * @discription: 电脑抽象接口，电脑的各个组件接收访问者的来访
 **/
public interface ComputerPart {
    //接待访问者
    public abstract void accept(ComputerPartVisitor computerPartVisitor);
}
