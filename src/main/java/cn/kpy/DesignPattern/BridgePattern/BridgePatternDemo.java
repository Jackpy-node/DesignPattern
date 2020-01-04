package cn.kpy.DesignPattern.BridgePattern;

public class BridgePatternDemo {
    public static void main(String[] args) {
        /**
         * new Circle(new RedCircle(), 100, 100, 300)
         * 父类DrawAPI引用指向子类对象new RedCircle();
         * 父类DrawAPI中的draw()方法为抽象方法
         * 但子类RedCircle()实现了父类DrawAPI中的draw()方法
         * 所以可以实现画图结果输出
         **/
        //定义了具体画图的规则
        Shape RedCircle=new Circle(new RedCircle(), 100, 100, 300);
        Shape GreenCircle=new Circle(new GreenCircle(), 200, 100, 500);
        ((Circle) RedCircle).draw();
        ((Circle) GreenCircle).draw();
    }
}
