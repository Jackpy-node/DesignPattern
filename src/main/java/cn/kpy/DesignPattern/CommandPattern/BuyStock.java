package cn.kpy.DesignPattern.CommandPattern;

public class BuyStock implements Order {
    public Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
