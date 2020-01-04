package cn.kpy.DesignPattern.CompositePattern;


//组合模式：把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次
public class CompositePatternDemo {
    public static void main(String[] args) {
        //因为CEO对象具有List<Employee>属性，所以可以在CEO对象内添加同类的成员，作为CEO对象的辖属成员
        Employee CEO = new Employee("John","CEO",30000);//CEO对象

        //创建与CEO对象具有共同属性的对象实例
        Employee headSales=new Employee("Laura", "Head Sale", 15000);//销售中心
        Employee headMarket=new Employee("James", "Head Market", 15000);//市场部

        //调用CEO对象的add()方法，为CEO对象添加辖属成员
        CEO.add(headSales);//CEO管辖销售中心
        CEO.add(headMarket);//CEO管辖市场部

        //因为headSales对象同样具有List<Employee>属性，所以可以继续为这两个对象在添加成员
        Employee salesman1=new Employee("Paul","Sale",10000);//销售员1
        Employee salesman2=new Employee("Dav","Sale",10000);//销售员2

        //调用headSales对象的add()方法，为headSales对象添加辖属成员
        headSales.add(salesman1);
        headSales.add(salesman2);

        //因为headMarket对象同样具有List<Employee>属性，所以可以继续为这两个对象在添加成员
        Employee marketer1=new Employee("Jack", "Market", 10000);//市场部员工1
        Employee marketer2=new Employee("Jack", "Market", 10000);//市场部员工2

        headMarket.add(marketer1);
        headMarket.add(marketer2);

        System.out.println("首席执行官："+CEO);
        for(Employee employee:CEO.getSubordinates()){
            System.out.println("--部门经理："+employee);
            for(Employee employee1:employee.getSubordinates()){
                System.out.println("----部门员工："+employee1);
            }
        }
    }
}
