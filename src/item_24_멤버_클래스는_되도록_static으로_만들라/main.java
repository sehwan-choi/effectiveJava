package item_24_멤버_클래스는_되도록_static으로_만들라;

public class main {

    public static void main(String[] args) {
        NestedNonStaticExample nestedNonStaticExample = new NestedNonStaticExample("test");

        String name = nestedNonStaticExample.getName();
        System.out.println("name = " + name);
    }
}
