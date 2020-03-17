package cn.kpy.DesignPattern.InterpretPattern;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        System.out.println("Data:"+data);
        //data定义了规则，context为传入的上下文，context.contains(data)判断上下文是否满足规则
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
