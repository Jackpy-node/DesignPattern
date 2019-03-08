package cn.kpy.DesignPattern.MediatorPattern;

import java.util.Date;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.MediatorPattern
 * @data:2019/3/5 19:02
 **/
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println("Date：" + new Date().toString() + ", name：" + user.getName() + ", message：" + message);
    }
}
