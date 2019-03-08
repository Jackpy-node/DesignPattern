package cn.kpy.DesignPattern.IteratorPattern;

public class NameContainer implements Container {
    public String names[]= {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }


    /**
     *
     * 1、内部类可以用多个实例，每个实例都有自己的状态信息，并且与其他外围对象的信息相互独立。
     * 2、在单个外围类中，可以让多个内部类以不同的方式实现同一个接口，或者继承同一个类。
     * 3、创建内部类对象的时刻并不依赖于外围类对象的创建。
     * 4、内部类并没有令人迷惑的“is-a”关系，他就是一个独立的实体。
     * 5、内部类提供了更好的封装，除了该外围类，其他类都不能访问。
     **/
    private class NameIterator implements Iterator{

        private int index;

        @Override
        public boolean hasNext() {
            return index<names.length?true:false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
