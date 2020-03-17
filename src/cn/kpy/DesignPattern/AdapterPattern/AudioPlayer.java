package cn.kpy.DesignPattern.AdapterPattern;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("Mp3")) {
            System.out.println("Play Mp3：" + fileName);
        } else if (audioType.equalsIgnoreCase("Mp4") || audioType.equalsIgnoreCase("Vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("AudioPlayer is not supporting "+audioType.toLowerCase()+" !");
        }
    }
}
