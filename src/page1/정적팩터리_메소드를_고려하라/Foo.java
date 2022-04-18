package page1.정적팩터리_메소드를_고려하라;

public interface Foo {

    static FooImpl createFooImpl() {
        return new FooImpl();
    }
}
