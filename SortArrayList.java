package Practice.Assignment7;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(31);
        numbers.add(18);
        numbers.add(9);
        numbers.add(53);

        Collections.sort(numbers);

        System.out.println("Sorted ArrayList: " + numbers);
    }
}
