package BuilderPattern;

/**
 * 복학 객체의 생성과정과 표현과정을 분리시켜 동일한 생성과정에서 다양한 표현을 생성할 수 있는 패턴
 *
 * 인스턴스를 조립한다.
 * */
public class main {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
