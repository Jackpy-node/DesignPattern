package cn.kpy.DesignPattern.ServiceLocatorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.ServiceLocatorPattern
 * @data: 2019/3/12 8:50
 * @discription: 缓存（Cache） - 缓存存储服务的引用，以便复用它们
 **/
public class Cache {
    private List<Service> serviceList;

    public Cache() {
        serviceList=new ArrayList<>();
    }

    public void addService(Service new_service){
        //缓存服务时，判断是否已经存在服务对象
        boolean exists=false;
        for(Service service:serviceList){
            if(service.getName().equalsIgnoreCase(new_service.getName())){
                exists=true;
            }
        }
        //如果缓存中没有该对象，则添加该对象到缓存当中
        if(!exists){
            serviceList.add(new_service);
        }
    }

    public Service getService(String serviceName) {
        for (Service service : serviceList) {
            if (service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("return cache service：" + serviceName);
                return service;
            }
        }
        return null;
    }
}
