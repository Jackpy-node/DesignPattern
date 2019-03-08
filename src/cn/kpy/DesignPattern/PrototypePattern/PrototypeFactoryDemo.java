package cn.kpy.DesignPattern.PrototypePattern;

public class PrototypeFactoryDemo {
    public static void main(String[] args) {
        //装载添加的图形
        ShapeCache.loadCache();
        Shape cloneShape=ShapeCache.getShape("1");
        System.out.println("shape:"+cloneShape.getType());
        cloneShape.draw();

        Shape cloneShape2=ShapeCache.getShape("2");
        System.out.println("shape:"+cloneShape2.getType());
        cloneShape2.draw();

    }
}
