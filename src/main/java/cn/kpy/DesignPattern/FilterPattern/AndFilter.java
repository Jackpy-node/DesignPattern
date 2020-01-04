package cn.kpy.DesignPattern.FilterPattern;

import java.util.List;

//复杂过滤器类(取交集)，将简单过滤器进行组合，通过简单条件组合筛选出唯一属性的对象
public class AndFilter implements Filter{

    private Filter filter;
    private Filter otherFilter;

    public AndFilter(Filter filter, Filter otherFilter) {
        this.filter = filter;
        this.otherFilter = otherFilter;
    }

    @Override
    public List<Person> meetFilter(List<Person> personList) {
        //第一层过滤器，通过传入对象实例调用对应类的筛选条件，筛选出符合第一层条件的对象集合
        List<Person> firstFilterPersons = filter.meetFilter(personList);
        //第二层过滤器，在第一层删选结果的基础上，通过传入对象实例调用对应类的筛选条件，筛选出第二层符合条件的对象集合
        List<Person> otherFilterPersons = otherFilter.meetFilter(firstFilterPersons);
        return otherFilterPersons;

    }
}
