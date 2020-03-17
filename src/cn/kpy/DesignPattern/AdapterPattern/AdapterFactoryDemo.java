package cn.kpy.DesignPattern.AdapterPattern;

public class AdapterFactoryDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("MP4", "God is a Girl !");
        audioPlayer.play("MP3","Far away !");
        audioPlayer.play("Vlc", "I want to go !");
        audioPlayer.play("AVi", "Test !");
    }
}
