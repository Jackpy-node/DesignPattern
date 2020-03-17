package cn.kpy.DesignPattern.BridgePattern;

//画图的具体实现
public class RedCircle implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("Draw Red Circle " + "[" + "radius:" + radius + ", " + "x:" + x + ", " + "y:" + y + "]");
    }
}
