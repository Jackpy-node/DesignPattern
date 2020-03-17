package cn.kpy.DesignPattern.StrategyPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.StrategyPattern
 * @data: 2019/3/6 19:26
 * @discription: 减法
 **/
public class SubOperation implements Strategy {
    @Override
    public int Operation(int num1, int num2) {
        return num1-num2;
    }
}
