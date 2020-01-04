package cn.kpy.DesignPattern.FrontControllerPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.FrontControllerPattern
 * @data: 2019/3/11 19:32
 * @discription: 前端控制器（Front Controller） - 处理应用程序所有类型请求的单个处理程序，应用程序可以是基于 web 的应用程序，也可以是基于桌面的应用程序
 **/
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    public boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully");
        return true;
    }

    //记录每一个请求
    public void track(String request) {
        System.out.println("Request：" + request);
    }

    public void dispatcherRequest(String request){
        track(request);

        //用户身份验证
        isAuthenticUser();

        //请求处理
        dispatcher.dispatcher(request);
    }

}
