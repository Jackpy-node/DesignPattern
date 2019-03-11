package cn.kpy.DesignPattern.CompositeEntityPattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.kpy.DesignPattern.CompositeEntityPattern
 * @data: 2019/3/11 8:47
 * @discription: 组合实体对象，主要的实体对象，包含粗粒度实体对象（CoarseGrainedObject）
 **/
public class CompositeEntity {
    CoarseGrainedObject coarseGrainedObject=new CoarseGrainedObject();

    public void setData(String data1,String data2){
        coarseGrainedObject.setData(data1, data2);
    }

    public String[] getData(){
        return coarseGrainedObject.getData();
    }

}
