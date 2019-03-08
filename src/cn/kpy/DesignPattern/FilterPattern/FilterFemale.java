package cn.kpy.DesignPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

//女性过滤器，通过person类的gender属性筛选出所有女性
public class FilterFemale implements Filter {
    @Override
    public List<Person> meetFilter(List<Person> personList) {
        List<Person> femalePersons=new ArrayList<>();
        for(Person person:personList){
            if(person.getGender().equalsIgnoreCase("Female")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
