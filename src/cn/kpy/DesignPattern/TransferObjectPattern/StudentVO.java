package cn.kpy.DesignPattern.TransferObjectPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.TransferObjectPatternDemo
 * @data: 2019/3/11 19:45
 * @discription:  简单的 POJO，只有设置/获取属性的方法，传输对象类
 **/
public class StudentVO {
    private String name;
    private int no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
