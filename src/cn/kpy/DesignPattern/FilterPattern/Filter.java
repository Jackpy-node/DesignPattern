package cn.kpy.DesignPattern.FilterPattern;

import java.util.List;

//创建过滤器筛选接口
public interface Filter {
    public abstract List<Person> meetFilter(List<Person> personList);
}
