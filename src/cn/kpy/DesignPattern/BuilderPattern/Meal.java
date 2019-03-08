package cn.kpy.DesignPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> list=new ArrayList();
    public void addItem(Item item){
        list.add(item);
    }

    public float getCost() {
        float cost = 0;
        for (Item item : list) {
            cost += item.price();
        }
        return cost;
    }

    public void showItem(){
        for(Item item:list){
            System.out.println("name:"+item.name());
            System.out.println("pack:"+item.packing().pack());
            System.out.println("price:"+item.price());
        }
    }

}
