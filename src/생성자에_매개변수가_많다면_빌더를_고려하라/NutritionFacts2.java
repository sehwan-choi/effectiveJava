package 생성자에_매개변수가_많다면_빌더를_고려하라;

public class NutritionFacts2 {
    private int servingSize;  // 필수
    private int servings;     // 필수
    private int calories;     // 선택
    private int fat;          // 선택
    private int sodium;       // 선택
    private int carbohydrate; // 선택

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
