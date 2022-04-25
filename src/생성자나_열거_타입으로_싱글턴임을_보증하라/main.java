package 생성자나_열거_타입으로_싱글턴임을_보증하라;

public class main {
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;

        Elvis2 elvis2 = Elvis2.getInstance();

        EnumElvis enumElvis = EnumElvis.INSTANCE;
    }
}
