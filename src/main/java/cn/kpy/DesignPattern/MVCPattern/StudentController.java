package cn.kpy.DesignPattern.MVCPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.MVCPattern
 * @data: 2019/3/7 18:29
 * @discription: 控制层类（controller）:控制器作用于模型和视图上。它控制数据流向模型对象，并在数据变化时更新视图。它使视图与模型分离开
 **/
public class StudentController {
    private StudentView studentView;//视图对象，负责展示实体对象信息
    private StudentModel studentModel;//实体对象

    public StudentController(StudentView studentView, StudentModel studentModel) {
        this.studentView = studentView;
        this.studentModel = studentModel;
    }

    public void setStudentName(String name){
        studentModel.setName(name);
    }

    public String getStudentName(){
        return studentModel.getName();
    }

    public void setStudentRollNo(String rollNo){
        studentModel.setRollNo(rollNo);
    }
    public String getStudentRollNo(){
        return studentModel.getRollNo();
    }

    //模型层数据发生变化时，更新视图层数据
    public void UpdateView(){
        studentView.showStudent(studentModel.getName(), studentModel.getRollNo());
    }

}
