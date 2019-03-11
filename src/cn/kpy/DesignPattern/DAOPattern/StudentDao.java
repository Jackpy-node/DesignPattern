package cn.kpy.DesignPattern.DAOPattern;

import java.util.List;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.DAOPattern
 * @data: 2019/3/11 18:12
 * @discription: 数据访问对象模式（Data Access Object Pattern）或 DAO 模式用于把低级的数据访问 API 或操作从高级的业务服务中分离出来，StudentDao数据访问接口层
 **/
public interface StudentDao {
    public abstract List<Student> getAllStudent();
    public abstract Student getStudent(int No);
    public abstract void updateStudent(Student student);
    public abstract void deleteStudent(Student student);
}
