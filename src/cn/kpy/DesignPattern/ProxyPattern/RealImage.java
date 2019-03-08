package cn.kpy.DesignPattern.ProxyPattern;

public class RealImage implements Image{
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        LoadFromDisk(filename);
    }

    @Override
    public void ShowImage() {
        System.out.println("Displaying：" + filename);
    }

    public void LoadFromDisk(String filename) {
        System.out.println("Loading From Disk：" + filename);
    }
}
