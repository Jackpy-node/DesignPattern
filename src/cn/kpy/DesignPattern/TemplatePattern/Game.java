package cn.kpy.DesignPattern.TemplatePattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.TemplatePattern
 * @data: 2019/3/6 19:54
 * @discription: 一个抽象类公开定义了执行它的方法的方式/模板，它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行
 **/
public abstract class Game {
    public abstract void InitGame();//加载游戏
    public abstract void StartGame();//开始游戏
    public abstract void EndGame();//结束游戏

    //提供统一的玩游戏的模板
    public void Play(){
        InitGame();
        StartGame();
        EndGame();
    }
}
