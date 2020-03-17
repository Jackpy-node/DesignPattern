package cn.kpy.ClassTest;

public class SonClass extends AbstractClass implements InterfaceClass {

    @Override
    public void show(String name, String sex) {
        System.out.println("name：" + name + "..." + "sex：" + sex);
    }

    @Override
    public void print() {
        System.out.println("MAX_LENGTH：" + MAX_LENGTH);
    }

    public static void main(String[] args) {
        SonClass sonClass = new SonClass();
        sonClass.show("James", "Male");
        sonClass.print();
    }
}
