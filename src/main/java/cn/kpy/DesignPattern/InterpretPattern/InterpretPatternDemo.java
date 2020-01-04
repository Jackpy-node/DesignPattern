package cn.kpy.DesignPattern.InterpretPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.InterpretPatternDemo
 * @data: 2019/3/7 8:38
 * @discription: 提供了评估语言的语法或表达式的方式，它属于行为型模式。这种模式实现了一个表达式接口，该接口解释一个特定的上下文
 **/


public class InterpretPatternDemo {

    //规则：Robert 和 John 是男性
    public static Expression IsMaleExpression(){
        Expression expression1=new TerminalExpression("Robert");
        Expression expression2=new TerminalExpression("John");
        return new OrExpression(expression1, expression2);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression IsMarriedWomanExpression(){
        Expression expression1=new TerminalExpression("Julie");
        Expression expression2=new TerminalExpression("Married");
        return new AndExpression(expression1, expression2);
    }

    public static void main(String[] args) {
        Expression IsMale= IsMaleExpression();
        Expression IsMarriedWoman=IsMarriedWomanExpression();

        System.out.println("John is Male ? ："+IsMale.interpret("John"));
        System.out.println("Julie is Married Woman ? ："+IsMarriedWoman.interpret("Married Julie in may. 2019"));
    }
}
