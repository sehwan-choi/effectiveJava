package 생성자에_매개변수가_많다면_빌더를_고려하라;

public class Teacher extends Person {

    private int zipCode;
    private String address;

    static class Builder extends Person.Builder<Builder> {

        private int zipCode;
        private String address;

        public Builder() {}

        public Builder zipCode(int zipCode) {this.zipCode = zipCode; return self();}
        public Builder address(String address) {this.address = address; return self();}

        @Override
        public Teacher build() { return new Teacher(this);};

        @Override
        protected Builder self(){return this;}
    }

    private Teacher(Builder builder) {
        super(builder);
        this.zipCode = builder.zipCode;
        this.address = builder.address;
    }
}
