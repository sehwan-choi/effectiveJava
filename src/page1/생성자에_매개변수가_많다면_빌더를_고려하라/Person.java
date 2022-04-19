package page1.생성자에_매개변수가_많다면_빌더를_고려하라;

public abstract class Person {

    private String name;
    private int age;
    private String birthDay;

    abstract static class Builder<T extends Builder<T>> {

        private String name;
        private int age;
        private String birthDay;

        public Builder() {}

        public T name(String name) {this.name = name; return self();}
        public T age(int age) {this.age = age; return self();}
        public T birthDay(String birthDay) {this.birthDay = birthDay; return self();}

        abstract public Person build();
        protected abstract T self();
    }

    protected Person(Builder<?> builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.birthDay = builder.birthDay;
    }
}
