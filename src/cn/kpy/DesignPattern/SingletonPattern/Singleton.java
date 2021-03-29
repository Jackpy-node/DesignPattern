package cn.kpy.DesignPattern.SingletonPattern;

public class Singleton {

    //饿汉式，静态常量，可用
    static class Singleton1 {
        private final static Singleton1 IN_SINGLETON1 = new Singleton1();

        private Singleton1() {
            // TODO Auto-generated constructor stub
        }

        public static Singleton1 getSingleton1(){
            return IN_SINGLETON1;
        }
    }

    //饿汉式，静态代码块实现，可用
    static class Singleton2{
        private static Singleton2 IN_SINGLETON2;

        private Singleton2() {
            // TODO Auto-generated constructor stub
        }
        static{
            IN_SINGLETON2=new Singleton2();
        }
        public static Singleton2 getSingleton2(){
            return IN_SINGLETON2;
        }
    }

    //懒汉式，非线程安全，不可用
    static class Singleton3{
        private static Singleton3 IN_SINGLETON3;

        private Singleton3() {
            // TODO Auto-generated constructor stub
        }

        public static Singleton3 getSingleton3() {
            if (IN_SINGLETON3 == null) {
                IN_SINGLETON3 = new Singleton3();
            }
            return IN_SINGLETON3;
        }
    }

    //懒汉式，线程安全，同步方法，不建议使用，效率较低
    static class Singleton4{
        private static Singleton4 IN_SINGLETON4;

        private Singleton4() {
            // TODO Auto-generated constructor stub
        }

        public static synchronized Singleton4 getSingleton4(){
            if(IN_SINGLETON4==null){
                IN_SINGLETON4=new Singleton4();
            }
            return IN_SINGLETON4;
        }
    }

    //懒汉式，线程安全，同步代码块，不可用
    static class Singleton5{
        private static Singleton5 IN_SINGLETON5;

        private Singleton5() {
            // TODO Auto-generated constructor stub
        }

        public static Singleton5 getSingleton5(){
            if(IN_SINGLETON5==null){
                synchronized (Singleton5.class) {
                    IN_SINGLETON5=new Singleton5();
                }
            }
            return IN_SINGLETON5;
        }
    }

    //双重检查，推荐使用
    static class Singleton6{
        private static Singleton6 IN_SINGLETON6;

        private Singleton6() {
            // TODO Auto-generated constructor stub
        }

        public static Singleton6 getSingleton6(){
            if(IN_SINGLETON6==null){
                synchronized(Singleton6.class){
                    if(IN_SINGLETON6==null){
                        IN_SINGLETON6=new Singleton6();
                    }
                }
            }
            return IN_SINGLETON6;
        }
    }

    //静态内部类，推荐使用
    static class Singleton7{

        private Singleton7() {
            // TODO Auto-generated constructor stub
        }

        private static class SingletonInstance{
            private static final Singleton7 IN_SINGLETON7=new Singleton7();
        }
        public static Singleton7 getSingleton7(){
            return SingletonInstance.IN_SINGLETON7;
        }
    }

    enum Singleton8{
        Instance;
        Singleton8() {
            System.out.println("Init Singleton8");
        }

        public void print(){
            System.out.println("test!");
        }
    }

    public static void main(String[] args) {
        Singleton8 singleton81=Singleton8.Instance;
        singleton81.print();
        Singleton8 singleton82=Singleton8.Instance;
        singleton82.print();
        Singleton8 singleton83=Singleton8.Instance;
        singleton83.print();
    }
}