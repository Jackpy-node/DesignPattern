package cn.kpy.DesignPattern.TemplatePattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.TemplatePattern
 * @data: 2019/3/6 19:58
 * @discription:
 **/
public class PalyFootball extends Game{
    @Override
    public void InitGame() {
        System.out.println("Init Football Game");
    }

    @Override
    public void StartGame() {
        System.out.println("Start Football Game");
    }

    @Override
    public void EndGame() {
        System.out.println("End Football Game");
    }
}
