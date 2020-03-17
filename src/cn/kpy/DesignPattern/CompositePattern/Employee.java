package cn.kpy.DesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        //为每一个对象提供一个存放包含自己对象组的容器，这样就可以为每个对象添加自己辖属的同类成员
        subordinates=new ArrayList<>();
    }

    public void add(Employee employee){
        subordinates.add(employee);
    }

    /*public void remove(Employee employee){
        subordinates.remove(employee);
    }*/

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Name：" + name + "，" + "Dept:" + dept + "，" + "Salary：" + salary;
    }
}
