package cn.kpy.DesignPattern.TemplatePattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.TemplatePattern
 * @data: 2019/3/6 19:59
 * @discription:
 **/
public class PlayBasketball extends Game{
    @Override
    public void InitGame() {
        System.out.println("Init Basketball Game");
    }

    @Override
    public void StartGame() {
        System.out.println("Start Basketball Game");
    }

    @Override
    public void EndGame() {
        System.out.println("End Basketball Game");
    }
}
