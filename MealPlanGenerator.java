interface MealPlan {
    void displayMealPlan();
}

class VegetarianMeal implements MealPlan {
    private String breakfast;
    private String lunch;
    private String dinner;

    public VegetarianMeal(String breakfast, String lunch, String dinner) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    @Override
    public void displayMealPlan() {
        System.out.println("Vegetarian Meal Plan: Breakfast - " + breakfast + ", Lunch - " + lunch + ", Dinner - " + dinner);
    }
}

class VeganMeal implements MealPlan {
    private String breakfast;
    private String lunch;
    private String dinner;

    public VeganMeal(String breakfast, String lunch, String dinner) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    @Override
    public void displayMealPlan() {
        System.out.println("Vegan Meal Plan: Breakfast - " + breakfast + ", Lunch - " + lunch + ", Dinner - " + dinner);
    }
}

class KetoMeal implements MealPlan {
    private String breakfast;
    private String lunch;
    private String dinner;

    public KetoMeal(String breakfast, String lunch, String dinner) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    @Override
    public void displayMealPlan() {
        System.out.println("Keto Meal Plan: Breakfast - " + breakfast + ", Lunch - " + lunch + ", Dinner - " + dinner);
    }
}

class HighProteinMeal implements MealPlan {
    private String breakfast;
    private String lunch;
    private String dinner;

    public HighProteinMeal(String breakfast, String lunch, String dinner) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    @Override
    public void displayMealPlan() {
        System.out.println("High-Protein Meal Plan: Breakfast - " + breakfast + ", Lunch - " + lunch + ", Dinner - " + dinner);
    }
}

class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void generateMealPlan() {
        mealPlan.displayMealPlan();
    }
}

public class MealPlanGenerator {
    public static void main(String[] args) {
        VegetarianMeal vegetarianMeal = new VegetarianMeal("Oatmeal", "Salad", "Veggie Stir-Fry");
        VeganMeal veganMeal = new VeganMeal("Smoothie", "Quinoa Salad", "Vegan Pizza");
        KetoMeal ketoMeal = new KetoMeal("Eggs and Avocado", "Grilled Chicken", "Salmon with Asparagus");
        HighProteinMeal highProteinMeal = new HighProteinMeal("Greek Yogurt", "Chicken Breast", "Protein Shake");

        Meal<VegetarianMeal> vegetarianMealPlan = new Meal<>(vegetarianMeal);
        Meal<VeganMeal> veganMealPlan = new Meal<>(veganMeal);
        Meal<KetoMeal> ketoMealPlan = new Meal<>(ketoMeal);
        Meal<HighProteinMeal> highProteinMealPlan = new Meal<>(highProteinMeal);

        vegetarianMealPlan.generateMealPlan();
        veganMealPlan.generateMealPlan();
        ketoMealPlan.generateMealPlan();
        highProteinMealPlan.generateMealPlan();
    }
}