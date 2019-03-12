package cn.kpy.DesignPattern.InterceptingFilterPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.InterceptingFilterPattern
 * @data: 2019/3/12 8:03
 * @discription: 过滤器实体， 过滤器在请求处理程序执行请求之前或之后，执行某些任务
 **/
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Debug log：" + request);
    }
}
