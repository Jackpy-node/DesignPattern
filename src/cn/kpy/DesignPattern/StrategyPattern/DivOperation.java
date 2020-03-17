package cn.kpy.DesignPattern.StrategyPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.StrategyPattern
 * @data: 2019/3/6 19:28
 * @discription: 除法
 **/
public class DivOperation implements Strategy {
    @Override
    public int Operation(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Not Divided By Zero");
        }
    }
}
