package cn.kpy.DesignPattern.TransferObjectPattern;

import cn.kpy.DesignPattern.DAOPattern.Student;

import java.util.List;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.TransferObjectPatternDemo
 * @data: 2019/3/11 19:52
 * @discription: 客户端可以发送请求或者发送传输对象到业务对象
 **/
public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        StudentBO studentBO=new StudentBO();

        //未修改时的信息
        System.out.println("Init：");
        Show(studentBO.getAllStudent());

        Student student=studentBO.getStudent(0);
        student.setName("James");
        studentBO.updateStudent(student);
        //更新之后的信息
        System.out.println("Update：");
        Show(studentBO.getAllStudent());

        studentBO.deleteStudent(studentBO.getStudent(1));
        //删除之后的信息
        System.out.println("Delete：");
        Show(studentBO.getAllStudent());
    }

    public static void Show(List<Student> studentList){
        for(Student student:studentList){
            System.out.println(student.getNo()+"..."+student.getName());
        }
    }
}
