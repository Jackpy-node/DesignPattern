package cn.kpy.DesignPattern.StrategyPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern
 * @data: 2019/3/6 19:23
 * @discription: 定义某种算法的共同属性接口
 **/
public interface Strategy {
    public abstract int Operation(int num1,int num2);
}
