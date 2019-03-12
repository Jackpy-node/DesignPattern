package cn.kpy.DesignPattern.InterceptingFilterPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.InterceptingFilterPattern
 * @data: 2019/3/12 8:04
 * @discription:  对象是请求处理程序
 **/
public class Target {
    public void execute(String request) {
        System.out.println("Target Execute Request：" + request);
    }
}
