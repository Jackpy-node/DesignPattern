package cn.kpy.DesignPattern.ProxyPattern;

import java.lang.reflect.Proxy;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void ShowImage() {
        //调用别人的方法形成自己独有的类方法，非线程安全
        if(realImage==null){
            synchronized(Proxy.class){
                if(realImage==null){
                    realImage=new RealImage(filename);
                }
            }
        }
        realImage.ShowImage();
    }
}
