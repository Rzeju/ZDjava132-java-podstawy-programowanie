package zad15;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 2, 1, 3, 1, 2, 10, 1, 10, 10, 10, 10, 3};

        int size = numbers.length;
        boolean visited[] = new boolean[size];
        Arrays.fill(visited, false);

        for (int i = 0; i < size; i++) {
            if (visited[i] == true) {
                continue;
            }
            int counter = 1;
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] == numbers[j]) {
                    visited[j] = true;
                    counter++;
                }
            }
            if (counter > 1) {
                System.out.println("Liczba która się powtórzyła to conajmniej 2 razy to: " + numbers[i]);
            }
        }

        ///BONUS
        Set uniques = new HashSet();
        Set result = new HashSet();
        for (int k = 0; k < numbers.length; k++) {
            if (!uniques.add(numbers[k])) {
                result.add(numbers[k]);
            }
        }
        result.forEach(x -> System.out.print(x + " "));
    }
}
