package cn.kpy.DesignPattern.IteratorPattern;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameContainer nameContainer=new NameContainer();
        Iterator iterator=nameContainer.getIterator();
        while (iterator.hasNext()){
            System.out.println("name："+iterator.next());
        }
    }
}
