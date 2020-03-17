package cn.kpy.DesignPattern.MVCPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.MVCPattern
 * @data: 2019/3/7 18:26
 * @discription: 学生视图类（View）:视图层负责数据展示
 **/
public class StudentView {
    public void showStudent(String name,String rollNo) {
        System.out.println("StudentModel：");
        System.out.println("Name：" + name);
        System.out.println("RollNo：" + rollNo);
    }
}
