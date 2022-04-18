package page1.정적팩터리_메소드를_고려하라;

import java.util.ArrayList;
import java.util.List;

public class TicketStore {

    /**
     * TicketSeller는 인터페이스이고 구현체가 없음에도 아래와 같은 메서드 작성이 가능하다.
     */

    public static List<TicketSeller> getSellers() {
        return new ArrayList<>();
    }
}
