package JDK8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sample{
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grape", "Pineapple");

        //fruits in ascending order
        System.out.println("Fruits in ascending order:");
        Collections.sort(fruits, (String fruit1, String fruit2) -> fruit1.compareTo(fruit2));
        System.out.println(fruits);

        //fruits in descending order
        System.out.println("Fruits in descending order:");
        Collections.sort(fruits, (String fruit1, String fruit2) -> fruit2.compareTo(fruit1));
        System.out.println(fruits);

        // sort in descending order using Comparator.reverseOrder()
        System.out.println("Fruits in descending order using reverseOrder:");
        Collections.sort(fruits, Comparator.reverseOrder());
        System.out.println(fruits);
    }
}
