package cn.kpy.DesignPattern.AdapterPattern;

//提供一个具有播放功能的播放器接口
public interface MediaPlayer {
    public abstract void play(String audioType,String fileName);
}
