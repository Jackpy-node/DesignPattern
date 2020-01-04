package cn.kpy.DesignPattern.BridgePattern;

//该接口具有画图的功能，但是具体画多大、形状、颜色不确定
public interface DrawAPI {
    public abstract void draw(int radius, int x, int y);
}
