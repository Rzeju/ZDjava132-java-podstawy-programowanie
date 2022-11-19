package zad20;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Utworzenie skanera
        Scanner scanner = new Scanner(System.in);

        //Utworzenie obiektu Random
        Random random = new Random();
        //Losowanie liczby z zakresu od 0 do 100
        //zwróć uwagę na argument tej metody 100 + 1
        int answer = random.nextInt(100 + 1);

        //nieskończona pętla while
        while (true) {
            //pobranie liczby od użytkownika
            int userAnswer = scanner.nextInt();
            //sprawdzenie czy odpowiedź użytkownika jest większa niż wynik
            if (userAnswer > answer) {
                //wypisanie informacji 'za dużo'
                System.out.println("Za dużo");
            //sprawdzenie czy odpowiedź użytkownika jest mniejsza niż wynik
            } else if (userAnswer < answer) {
                //wypisanie informacji 'za mało'
                System.out.println("Za mało");
            //else -> dla pozostałych wyników (kiedy wartość użytkonika jest równa wynikowi
            } else {
                //wypisanie informacji o wygranej
                System.out.println("BINGO!");
                //przerwanie działania programu
                break;
            }
        }
    }
}
