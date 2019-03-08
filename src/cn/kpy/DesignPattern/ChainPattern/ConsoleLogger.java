package cn.kpy.DesignPattern.ChainPattern;

//一般日志级别
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("Console log：" + message);
    }
}
