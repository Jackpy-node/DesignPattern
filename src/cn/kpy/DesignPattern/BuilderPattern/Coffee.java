package cn.kpy.DesignPattern.BuilderPattern;

public class Coffee extends ColdDrink {
    @Override
    public String name() {
        return "Coffee";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
