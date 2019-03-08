package cn.kpy.DesignPattern.CommandPattern;

public class Stock {
    private String name = "ABC";
    private int num = 10;

    public void buy() {
        System.out.println("name：" + name + ", " + "num：" + num + " buy");
    }

    public void sell() {
        System.out.println("name：" + name + ", " + "num：" + num + " sell");
    }
}
