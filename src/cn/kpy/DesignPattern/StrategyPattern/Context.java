package cn.kpy.DesignPattern.StrategyPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.StrategyPattern
 * @data: 2019/3/6 19:32
 * @discription:
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeOperator(int num1,int num2){
        return strategy.Operation(num1, num2);
    }
}
