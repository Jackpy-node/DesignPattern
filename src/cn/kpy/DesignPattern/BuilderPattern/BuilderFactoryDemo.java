package cn.kpy.DesignPattern.BuilderPattern;

public class BuilderFactoryDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        meal.showItem();
        System.out.println("Veg Meal Cost:" + meal.getCost());
    }
}
