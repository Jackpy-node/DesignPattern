package cn.kpy.DesignPattern.TransferObjectPattern;

import cn.kpy.DesignPattern.DAOPattern.Student;
import cn.kpy.DesignPattern.FilterPattern.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.TransferObjectPatternDemo
 * @data: 2019/3/11 19:46
 * @discription: 为传输对象填充数据的业务服务，业务对象类
 **/
public class StudentBO {
    private List<Student> studentList;

    public StudentBO() {
        studentList=new ArrayList<>();
        Student student1=new Student("John", 0);
        Student student2=new Student("Robert", 1);
        studentList.add(student1);
        studentList.add(student2);
    }

    public List<Student> getAllStudent(){
        return studentList;
    }

    public Student getStudent(int no){
        return studentList.get(no);
    }

    public void updateStudent(Student student){
        studentList.get(student.getNo()).setName(student.getName());
    }

    public void deleteStudent(Student student){
        studentList.remove(student.getNo());
    }
}
