package cn.kpy.DesignPattern.BridgePattern;

//创建实现了Shape接口的实体类，画圆时需要使用画图工具，所以继承了Shape类，因为它具有画图工具
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        /**
         * 因为父类存在带参构造函数，所以super显式调用了父类带参构造函数
         * 正常情况下，子类隐式调用父类无参构造函数，super()
         **/
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw(){
        drawAPI.draw(radius, x, y);
    }
}
