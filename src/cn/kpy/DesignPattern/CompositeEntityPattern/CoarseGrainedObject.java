package cn.kpy.DesignPattern.CompositeEntityPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.CompositeEntityPattern
 * @data: 2019/3/11 8:42
 * @discription: 粗粒度对象：包含依赖对象（Dependent Object），管理依赖对象的生命周期
 **/
public class CoarseGrainedObject {
    DependentObject1 dependentObject1=new DependentObject1();
    DependentObject2 dependentObject2=new DependentObject2();

    public void setData(String data1,String data2){
        dependentObject1.setData(data1);
        dependentObject2.setData(data2);
    }

    public String[] getData(){
        return new String[]{dependentObject1.getData(),dependentObject2.getData()};
    }
}
