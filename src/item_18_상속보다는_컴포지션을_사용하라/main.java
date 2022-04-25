package item_18_상속보다는_컴포지션을_사용하라;

import java.util.HashSet;
import java.util.List;

public class main {

    public static void main(String[] args) {

        InstrumentedHashSet<Integer> integers = new InstrumentedHashSet<>();
        
        integers.addAll(List.of(1,2,3,4));

        System.out.println("integers.size() = " + integers.getAddCount());

        InstrumentedSet<Integer> instrumentedSet = new InstrumentedSet<>(new HashSet<>());

        instrumentedSet.addAll(List.of(1,2,3,4));

        System.out.println("instrumentedSet.size() = " + instrumentedSet.getAddCount());
    }
}
