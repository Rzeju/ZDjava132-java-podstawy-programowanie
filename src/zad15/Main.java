package zad15;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //liczby wprowadzone przez użytkownika
        int[] numbers = {1, 3, 2, 1, 3, 1, 2, 10, 1, 10, 10, 10, 10, 3};

        //rozmiar tablicy 'numbers' -> liczba liczb wprowadzonych przez użytkownika
        int size = numbers.length;
        //tablica wartości logicznych, zachowuje informacje czy data liczba była już sprawdzana
        //dla wartości 1 w podanej tablicy wystarczy porównać pierwszą z nich z pozostałymi liczbami
        //i zapamiętać ile razy wystąpiła (tutaj 4 razy)
        //potem nie ma już potrzeby powtórnego sprawdzania pozostałych 1 (jedynek)
        boolean visited[] = new boolean[size];
        //początkowo żadna z liczb nie została jeszcze odwiedzona, stąd false
        Arrays.fill(visited, false);

        //Pętla porónująca liczby
        for (int i = 0; i < size; i++) {
            //sprawdzenie czy dana liczba była już sprawdzona
            if (visited[i] == true) {
                //jeżeli dana liczba była już sprawdzona, pomiń ją (pomiń ten krok, obrót pętli)
                continue;
            }
            //zmienna pomocnicza, informuje o liczbie wystąpień danej liczby w tablicy
            int counter = 1;
            //pętla porównuje daną liczbę z pozostałymi. Nie porównuje liczby samej ze sobą, stąd (j = i + 1)
            for (int j = i + 1; j < size; j++) {
                //sprawdzenie czy liczby są takie same
                if (numbers[i] == numbers[j]) {
                    //jeżeli takie same to ustaw, że dana liczba była już spradzwona (true)
                    //zwiększa counter o 1
                    visited[j] = true;
                    counter++;
                }
            }
            //jeżeli dana liczba wystąpiłą więcej niż raz, wypisz ją na ekran
            if (counter > 1) {
                System.out.println("Liczba która się powtórzyła to conajmniej 2 razy to: " + numbers[i]);
            }
        }

        ///BONUS
        //Zadanie rozwiązane za podstawie kolekcji Set
        //Set nie przetryzmuje w sobie duplikatów (zbiór nie ma takich samych elemntów)
        //Tutaj możecie doczytać o zbiorze i o wykoryzstanych metodach
        Set uniques = new HashSet();
        Set result = new HashSet();
        for (int k = 0; k < numbers.length; k++) {
            if (!uniques.add(numbers[k])) {
                result.add(numbers[k]);
            }
        }
        //Tutaj użyte wyrażenie lambda, również ewentualnie do samodzielnego doczytania
        result.forEach(x -> System.out.print(x + " "));
    }
}
