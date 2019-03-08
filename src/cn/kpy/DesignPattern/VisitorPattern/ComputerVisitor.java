package cn.kpy.DesignPattern.VisitorPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.VisitorPattern
 * @data: 2019/3/7 8:42
 * @discription: 访问者实体类，具体实现了访问者访问各部分功能之后，自身做出的响应
 **/
public class ComputerVisitor implements ComputerPartVisitor{
    //访问者成功访问鼠标后，开始使用鼠标
    @Override
    public void visit(Mouse mouse) {
        System.out.println("Using mouse");
    }

    //访问者成功访问键盘后，开始使用键盘
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Using keyboard");
    }

    //访问者成功访问电脑后，开始使用电脑
    @Override
    public void visit(Computer computer) {
        System.out.println("Using computer");
    }
}
