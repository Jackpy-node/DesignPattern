package cn.kpy.DesignPattern.DAOPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.DAOPattern
 * @data: 2019/3/11 18:20
 * @discription: 数据访问对象模式（Data Access Object Pattern）或 DAO 模式用于把低级的数据访问 API 或操作从高级的业务服务中分离出来，StudentDaoImpl数据访问实现层
 **/
public class StudentDaoImpl implements StudentDao{

    List<Student> studentList;

    public StudentDaoImpl() {
        studentList=new ArrayList<>();
        Student student1=new Student("John", 0);
        Student student2=new Student("Robert", 1);
        studentList.add(student1);
        studentList.add(student2);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentList;
    }

    @Override
    public Student getStudent(int No) {
        return studentList.get(No);
    }

    @Override
    public void updateStudent(Student student) {

        //通过学号更新学生姓名
        System.out.println("The line " + (student.getNo() + 1) + "th is updated");
        studentList.get(student.getNo()).setName(student.getName());
    }

    @Override
    public void deleteStudent(Student student) {
        //通过学号删除学生信息
        System.out.println("DELETE NO："+student.getNo());
        System.out.println(student.getNo()+"..."+student.getName()+" is deleted");
        studentList.remove(student.getNo());
    }
}
