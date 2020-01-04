package cn.kpy.DesignPattern.FlyweightPattern;


//享元模式：减少对象的创建，减少内存占用率，提高性能，在创建对象时，采用单例模式，线程安全
public class FlyweightPattern {
    private final static String colors[]={"Red","Blue","Green"};
    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            Circle circle= (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getX());
            circle.setY(getY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    public static String getRandomColor(){
        return colors[(int) (Math.random()*colors.length)];
    }

    public static int getX() {
        return (int) (Math.random() * 100);
    }

    public static int getY() {
        return (int) (Math.random() * 100);
    }

}
