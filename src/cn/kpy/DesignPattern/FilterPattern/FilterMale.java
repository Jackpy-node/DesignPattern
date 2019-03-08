package cn.kpy.DesignPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

//男性过滤器，通过person类的gender属性筛选出所有男性
public class FilterMale implements Filter {
    @Override
    public List<Person> meetFilter(List<Person> personList) {
        List<Person> malePersons=new ArrayList<>();
        for(Person person:personList){
            if(person.getGender().equalsIgnoreCase("Male")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
