package cn.kpy.DesignPattern.AdapterPattern;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        //根据类型不同，创建不同的播放器对象
        if(audioType.equalsIgnoreCase("Mp4")){
            advancedMediaPlayer=new PlayMp4();
        }
        else if(audioType.equalsIgnoreCase("Vlc")){
            advancedMediaPlayer=new PlayVlc();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        //根据类型不同，由不同播放器对象调用自己的方法进行播放
        if(audioType.equalsIgnoreCase("Mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
        else if(audioType.equalsIgnoreCase("Vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }
    }
}
