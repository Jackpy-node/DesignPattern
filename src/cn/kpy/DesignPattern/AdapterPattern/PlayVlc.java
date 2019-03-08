package cn.kpy.DesignPattern.AdapterPattern;

public class PlayVlc implements AdvancedMediaPlayer{
    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("play Vlc："+fileName);
    }
}
