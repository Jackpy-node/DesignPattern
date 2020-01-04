package cn.kpy.DesignPattern.AdapterPattern;

public class PlayMp4 implements AdvancedMediaPlayer{
    @Override
    public void playMp4(String fileName) {
        System.out.println("play Mp4："+fileName);
    }

    @Override
    public void playVlc(String fileName) {

    }
}
