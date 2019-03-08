package cn.kpy.DesignPattern.CommandPattern;

public class SellStock implements Order{

    public Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
