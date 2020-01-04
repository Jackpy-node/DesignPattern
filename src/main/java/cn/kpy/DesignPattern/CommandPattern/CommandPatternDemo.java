package cn.kpy.DesignPattern.CommandPattern;

public class CommandPatternDemo {
    public static void main(String[] args) {
        //目标对象请求实例
        Stock stock=new Stock();

        //命令对象实例
        BuyStock buyStock=new BuyStock(stock);
        SellStock sellStock=new SellStock(stock);

        //命令调用实例，调用不同的命令
        Broker broker=new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        //命令执行
        broker.palceOrder();

    }
}
