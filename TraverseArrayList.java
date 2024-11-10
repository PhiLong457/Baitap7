package Practice.Assignment7;

import java.util.ArrayList;

public class TraverseArrayList {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Hanoi");
        cities.add("Ho Chi Minh City");
        cities.add("Da Nang");
        cities.add("Hai Phong");
        cities.add("Can Tho");
        for (String city : cities) {
            System.out.println(city);
        }

    }
}
