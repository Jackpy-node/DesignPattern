package cn.kpy.DesignPattern.DAOPattern;

import java.util.List;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.DAOPattern
 * @data: 2019/3/11 17:43
 * @discription: 数据访问对象模式（Data Access Object Pattern）或 DAO 模式用于把低级的数据访问 API 或操作从高级的业务服务中分离出来,student模型对象层
 **/
public class Student {
    private String name;
    private int No;

    public Student(String name, int no) {
        this.name = name;
        No = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }
}
