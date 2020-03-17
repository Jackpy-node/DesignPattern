package cn.kpy.DesignPattern.ChainPattern;

public abstract class AbstractLogger {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){

        //判断传入level是否大于等于已有对象最高级日志级别this.level，如果比最高级日志级别还高this.level，则该日志级别肯定满足最高级
        if(level>=this.level){
            this.write(message);//当前最高级日志信息输出
        }
        //否则，小于最高级日志级别，则判断有没有下一级日志，类似于递归
        if(nextLogger!=null){
            nextLogger.logMessage(level, message);
        }
    }

    public abstract void write(String message);
}
