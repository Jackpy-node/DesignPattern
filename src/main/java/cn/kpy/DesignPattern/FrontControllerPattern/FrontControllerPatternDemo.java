package cn.kpy.DesignPattern.FrontControllerPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.FrontControllerPattern
 * @data: 2019/3/11 19:37
 * @discription: 前端控制器模式（Front Controller Pattern）是用来提供一个集中的请求处理机制，所有的请求都将由一个单一的处理程序处理
 **/
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController=new FrontController();
        frontController.dispatcherRequest("Student");
        frontController.dispatcherRequest("Home");
    }
}
