package cn.kpy.ExtendsClass;

class Parent{
    public void play(){
        System.out.println("Dance.play");
    }
    public void play(int i){
        System.out.println("Dance.play：" + i);
    }
}

class Latin extends Parent {
    public void play(){
        System.out.println("Latin.play");
    }
    public void play(char c){
        System.out.println("Latin.play：" + c);
    }
}

public class Dance {
    public static void main(String[] args) {
        Parent parent=new Latin();
        parent.play();
        parent.play(123);
        ((Latin) parent).play('c');
    }
}

