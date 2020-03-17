package cn.kpy.DesignPattern.BridgePattern;

//使用DrawAPI接口创建抽象类Shape，提供画图的工具实例
public abstract class Shape  {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
}
