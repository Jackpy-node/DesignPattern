package cn.kpy.DesignPattern.CompositeEntityPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.CompositeEntityPattern
 * @data: 2019/3/11 8:52
 * @discription: 组合实体对象客户端类
 **/
public class Client {
    private CompositeEntity compositeEntity=new CompositeEntity();
    public void print(){
        for(String data:compositeEntity.getData()){
            System.out.println("Data："+data);
        }
    }

    public void setData(String data1,String data2){
        compositeEntity.setData(data1, data2);
    }
}
