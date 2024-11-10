package Practice.Assignment7;

import java.util.ArrayList;

public class ConvertArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        Integer[] numbersArray = new Integer[numbers.size()];
        numbers.toArray(numbersArray);

        System.out.println("Array elements:");
        for (Integer num : numbersArray) {
            System.out.println(num);
        }
    }
}
