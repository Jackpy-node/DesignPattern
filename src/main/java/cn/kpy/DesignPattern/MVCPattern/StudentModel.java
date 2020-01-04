package cn.kpy.DesignPattern.MVCPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.MVCPattern
 * @data: 2019/3/7 18:24
 * @discription: 学生对象模型（model）：模型层负责数据存储更新
 **/
public class StudentModel {
    private String rollNo;
    private String name;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
