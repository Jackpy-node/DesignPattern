package cn.kpy.DesignPattern.InterpretPattern;

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
