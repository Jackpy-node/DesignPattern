package cn.kpy.DesignPattern.StrategyPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.StrategyPattern
 * @data: 2019/3/6 19:45
 * @discription: 各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法
 **/
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new AndOperation());
        System.out.println("num1+num2：" + context.executeOperator(10, 5));

        context = new Context(new SubOperation());
        System.out.println("num1-num2：" + context.executeOperator(10, 5));

        context = new Context(new MulOperation());
        System.out.println("num1*num2：" + context.executeOperator(9999, 999));

        context = new Context(new DivOperation());
        System.out.println("num1/num2：" + context.executeOperator(9999, 9));


    }
}
