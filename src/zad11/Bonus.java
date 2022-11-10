package zad11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Bonus {

    public static void main(String[] args) {

        //ARRAY LIST ZOBACZ SOBIE!!
        List<String> names = Arrays.asList(
                "Bond",
                "James",
                "Einstein",
                "Alice",
                "Whitman",
                "Bob",
                "Binny",
                "Spider",
                "Lee",
                "Anderson"
        );


        Map<Integer, List<String>> map = names
                .stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Length and its List of Strings :-");
        map.entrySet().forEach(System.out::println);

        List<String> longestStrings = map
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue)
                .get();

        System.out.println("\nLongest Strings in List :- \n" + longestStrings);


    }
}
