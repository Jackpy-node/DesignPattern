package cn.kpy.DesignPattern.ChainPattern;

//责任链模式：通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。
public class ChainPatternDemo {

    public static AbstractLogger getChainInfo(){

        AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.INFO);//日志级别：1
        AbstractLogger debugLogger=new DebugLogger(AbstractLogger.DEBUG);//日志级别：2
        AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);//日志级别：3

        errorLogger.setNextLogger(debugLogger);//如果不是error级别日志，则继续向下判断是不是debug级别日志
        debugLogger.setNextLogger(consoleLogger);//如果不是debug级别日志，则继续向下判断是不是info级别日志

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger logger=getChainInfo();
        logger.logMessage(AbstractLogger.INFO, "this is console info !");
        System.out.println();
        logger.logMessage(AbstractLogger.DEBUG, "this is debug !");
        System.out.println();
        logger.logMessage(AbstractLogger.ERROR, "this is error !");
    }
}
