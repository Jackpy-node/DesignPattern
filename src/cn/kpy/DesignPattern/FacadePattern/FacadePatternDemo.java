package cn.kpy.DesignPattern.FacadePattern;

//外观模式，隐藏系统内部的复杂性，对外提供访问系统的统一入口
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker=new ShapeMaker();

        shapeMaker.DrawCircle();
        shapeMaker.DrawRectangle();
    }
}
