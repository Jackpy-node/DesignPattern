package cn.kpy.DesignPattern.MVCPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.MVCPattern
 * @data: 2019/3/7 18:40
 * @discription: 控制器作用于模型和视图上。它控制数据流向模型对象，并在数据变化时更新视图。它使视图与模型分离开
 **/
public class MVCPatternDemo {
    public static StudentModel StudentFactory(){
        StudentModel studentModel=new StudentModel();
        studentModel.setName("John");
        studentModel.setRollNo("10.");
        return studentModel;
    }

    public static void main(String[] args) {
        //产生数据模型
        StudentModel studentModel=StudentFactory();

        //产生视图层实例对象
        StudentView studentView=new StudentView();

        //通过控制层将模型层与视图层分离
        StudentController studentController=new StudentController(studentView,studentModel);

        //模型层数据改变时，更新视图层内容
        studentController.UpdateView();

        //模型层数据改变时，更新视图层内容
        studentController.setStudentName("Robt");//控制层实际调用了模型层的方法
        studentController.UpdateView();//更新视图层展示的数据



    }

}
