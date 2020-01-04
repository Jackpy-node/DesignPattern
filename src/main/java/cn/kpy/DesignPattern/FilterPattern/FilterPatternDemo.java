package cn.kpy.DesignPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class FilterPatternDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Robert", "Male", "Single"));
        personList.add(new Person("John", "Male", "Married"));
        personList.add(new Person("Laura", "Female", "Married"));
        personList.add(new Person("Diana", "Female", "Single"));
        personList.add(new Person("Mike", "Male", "Single"));
        personList.add(new Person("Bobby", "Male", "Single"));

        Filter filterMale = new FilterMale();
        Filter filterFemale = new FilterFemale();
        Filter filterSingle = new FilterSingle();
        Filter SingleAndMale = new AndFilter(filterSingle, filterMale);
        Filter SingleOrFemale = new OrFilter(filterSingle, filterFemale);

        System.out.println("Male：");
        ShowPerson(filterMale.meetFilter(personList));

        System.out.println("Female：");
        ShowPerson(filterFemale.meetFilter(personList));

        System.out.println("Single：");
        ShowPerson(filterSingle.meetFilter(personList));

        System.out.println("Single and Male：");
        ShowPerson(SingleAndMale.meetFilter(personList));

        System.out.println("Single or Female：");
        ShowPerson(SingleOrFemale.meetFilter(personList));
    }

    public static void ShowPerson(List<Person> personList) {
        for (Person person : personList) {
            System.out.println("Person：[ name：" + person.getName() + ", " + "Gender：" + person.getGender() + ", " + "Marital status：" + person.getMaritalStatus() + "]");
        }
    }
}
