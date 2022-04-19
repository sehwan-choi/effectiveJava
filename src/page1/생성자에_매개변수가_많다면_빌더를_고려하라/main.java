package page1.생성자에_매개변수가_많다면_빌더를_고려하라;

public class main {

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo.Builder()
                .name("hong")
                .address("seoul")
                .age(20)
                .birthDay("2000-01-01")
                .sex('M')
                .zipCode(11111)
                .build();

        Student student = new Student.Builder()
                .curriculum("high school")
                .grade(1)
                .age(17)
                .birthDay("2000-01-01")
                .name("choi")
                .build();

        Teacher teacher = new Teacher.Builder()
                .address("seoul")
                .age(29)
                .birthDay("1990-01-01")
                .name("park")
                .build();

        NutritionFacts2 facts2 = new NutritionFacts2();
        facts2.setServingSize(240);
        facts2.setServings(8);
        facts2.setCalories(100);
        facts2.setSodium(35);
        facts2.setCarbohydrate(27);
    }
}
