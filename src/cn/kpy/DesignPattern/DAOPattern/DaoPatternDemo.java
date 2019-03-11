package cn.kpy.DesignPattern.DAOPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.DAOPattern
 * @data: 2019/3/11 18:34
 * @discription: 数据访问对象模式（Data Access Object Pattern）或 DAO 模式用于把低级的数据访问 API 或操作从高级的业务服务中分离出来
 **/
public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        for (Student student : studentDao.getAllStudent()) {
            System.out.println(student.getNo() + "..." + student.getName());
        }

        //更新学生对象
        Student student = studentDao.getAllStudent().get(0);
        student.setName("Cherry");
        studentDao.updateStudent(student);

        for (Student student1 : studentDao.getAllStudent()) {
            System.out.println(student1.getNo() + "..." + student1.getName());
        }

        //删除学生
        Student student1 = studentDao.getAllStudent().get(1);
        studentDao.deleteStudent(student1);
    }
}
