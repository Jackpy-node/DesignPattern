package cn.kpy.DesignPattern.MediatorPattern;

import java.nio.charset.Charset;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.MediatorPattern
 * @data:2019/3/5 19:04
 **/
public class User {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(new User(name), message);
    }
}
