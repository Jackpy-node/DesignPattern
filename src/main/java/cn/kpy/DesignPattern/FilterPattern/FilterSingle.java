package cn.kpy.DesignPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

//通过person类的MaritalStatus属性过滤出未婚人士
public class FilterSingle implements  Filter{
    @Override
    public List<Person> meetFilter(List<Person> personList) {
        List<Person> singlePersons=new ArrayList<>();
        for(Person person:personList){
            if(person.getMaritalStatus().equalsIgnoreCase("Single")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
