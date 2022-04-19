package page1.생성자에_매개변수가_많다면_빌더를_고려하라;

public class Student extends Person{

    private String name;
    private int age;
    private String birthDay;
    private String curriculum;
    private int grade;

    public static class Builder extends Person.Builder<Builder> {

        private String curriculum;
        private int grade;

        public Builder() {}

        public Builder curriculum(String curriculum) {this.curriculum = curriculum; return this;}
        public Builder grade(int grade) {this.grade = grade; return this;}

        @Override
        public Student build() {return new Student(this);}

        @Override
        protected Builder self() {return this;}
    }

    private Student(Builder builder) {
        super(builder);
        this.curriculum = builder.curriculum;
        this.grade = builder.grade;
    }
}
