package page1.생성자나_열거_타입으로_싱글턴임을_보증하라;

public class Elvis {

    public static final Elvis INSTANCE = new Elvis();

    private Elvis(){}
}
