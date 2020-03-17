package cn.kpy.DesignPattern.FilterPattern;

import java.util.List;

//复杂过滤器类(取并集)，将简单过滤器进行组合，通过简单条件组合筛选出唯一属性的对象
public class OrFilter implements Filter{
    private Filter filter;
    private Filter otherFilter;

    public OrFilter(Filter filter, Filter otherFilter) {
        this.filter = filter;
        this.otherFilter = otherFilter;
    }


    @Override
    public List<Person> meetFilter(List<Person> personList) {
        //第一层过滤器，通过传入对象实例调用对应类的筛选条件，筛选出符合第一层条件的对象集合
        List<Person> firstFilterPersons = filter.meetFilter(personList);
        //第二层过滤器，通过传入对象实例调用对应类的筛选条件，筛选出符合第二层条件的对象集合
        List<Person> otherFilterPersons = otherFilter.meetFilter(personList);

        //对两个结果集进行合并处理
        for (Person person : otherFilterPersons) {
            if(!firstFilterPersons.contains(person)){
                firstFilterPersons.add(person);
            }
        }
        return firstFilterPersons;
    }
}
