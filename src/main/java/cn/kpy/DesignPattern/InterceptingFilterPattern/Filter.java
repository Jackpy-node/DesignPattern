package cn.kpy.DesignPattern.InterceptingFilterPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.InterceptingFilterPattern
 * @data: 2019/3/12 8:00
 * @discription: 过滤器接口， 过滤器在请求处理程序执行请求之前或之后，执行某些任务
 **/
public interface Filter {
    public abstract void execute(String request);
}
