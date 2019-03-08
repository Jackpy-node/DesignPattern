package cn.kpy.DesignPattern.StrategyPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.StrategyPattern
 * @data: 2019/3/6 19:27
 * @discription: 乘法
 **/
public class MulOperation implements Strategy {
    @Override
    public int Operation(int num1, int num2) {
        if (((long) num1 * (long) num2) > Integer.MAX_VALUE) {
            throw new RuntimeException("More Than Integer Max Value");
        } else {
            return num1*num2;
        }
    }
}
