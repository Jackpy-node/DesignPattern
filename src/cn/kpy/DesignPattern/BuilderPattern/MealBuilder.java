package cn.kpy.DesignPattern.BuilderPattern;

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coffee());
        return meal;
    }

    public Meal prepareNoVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
