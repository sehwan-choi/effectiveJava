package page1.생성자에_매개변수가_많다면_빌더를_고려하라;

public class UserInfo {

    private String name;
    private int age;
    private int zipCode;
    private String address;
    private char sex;
    private String birthDay;

    public static class Builder {

        private String name;
        private int age;
        private int zipCode;
        private String address;
        private char sex;
        private String birthDay;

        public Builder() {}

        public Builder name(String name) {this.name = name; return this;}
        public Builder age(int age) {this.age = age; return this;}
        public Builder zipCode(int zipCode) {this.zipCode = zipCode; return this;}
        public Builder address(String address) {this.address = address; return this;}
        public Builder sex(char sex) {this.sex = sex; return this;}
        public Builder birthDay(String birthDay) {this.birthDay = birthDay; return this;}

        public UserInfo build() {return new UserInfo(this);}
    }

    private UserInfo(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.zipCode = builder.zipCode;
        this.address = builder.address;
        this.sex = builder.sex;
        this.birthDay = builder.birthDay;
    }
}
