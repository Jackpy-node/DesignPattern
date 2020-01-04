package cn.kpy.DesignPattern.FrontControllerPattern;

import cn.kpy.DesignPattern.DAOPattern.Student;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.FrontControllerPattern
 * @data: 2019/3/11 19:28
 * @discription: 调度器（Dispatcher） - 前端控制器可能使用一个调度器对象来调度请求到相应的具体处理程序
 **/
public class Dispatcher {
    private HomeView homeView;
    private StudentView studentView;

    public Dispatcher() {
        homeView=new HomeView();
        studentView=new StudentView();
    }

    public void dispatcher(String request){
        if(request.equalsIgnoreCase("student")){
            studentView.show();
        }
        else {
            homeView.show();
        }
    }
}
