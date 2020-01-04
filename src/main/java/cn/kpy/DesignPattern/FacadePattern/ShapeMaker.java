package cn.kpy.DesignPattern.FacadePattern;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;

    /**
     * 在构造函数中需要直接内部对象，而不是通过外部传参，外部只需要调用统一入口，获取相应的实现方法以满足自身需求
     **/
    public ShapeMaker() {
        circle=new Circle();
        rectangle=new Rectangle();
    }

    public void DrawCircle(){
        circle.draw();
    }

    public void DrawRectangle(){
        rectangle.draw();
    }
}
