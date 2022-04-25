package item_20_추상클래스보다는_인터페이스를_우선하라;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class main {

    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4};
        List<Integer> integers = intArrayAsList(arr);
        System.out.println("integers.get(1) = " + integers.get(1));
        System.out.println("integers.size() = " + integers.size());
    }
    
    static List<Integer> intArrayAsList(int[] a) {
        Objects.requireNonNull(a);
        
        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return a[index];
            }

            @Override
            public int size() {
                return a.length;
            }
        };
    }
}
