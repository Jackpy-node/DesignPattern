package cn.kpy.DesignPattern.TemplatePattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.TemplatePattern
 * @data: 2019/3/6 20:00
 * @discription: 一个抽象类公开定义了执行它的方法的方式/模板，它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行
 **/
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game=new PlayBasketball();
        //按照模板定义的流程玩篮球游戏
        game.Play();
        System.out.println();
        //按照模板定义的流程玩足球游戏
        game = new PalyFootball();
        game.Play();
    }
}
