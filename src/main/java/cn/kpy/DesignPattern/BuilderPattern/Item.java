package cn.kpy.DesignPattern.BuilderPattern;

public interface Item {
    public abstract String name();
    public abstract Packing packing();
    public abstract float price();
}
