package zad6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Utworzenie skanera
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę = ");
        //Przypisanie do zmiennej liczby podanej przez użytkownika
        int n = scanner.nextInt();

        //zmienna pomocnicza do przechowania sumy
        float sum = 0;
        //pętla zliczająca sumę odwrotności kolejnych liczb do n włącznie
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0f / i;
        }

        System.out.println("Suma szeregu harmonicznego wynosi = " + sum);


        System.out.println("Metoda wyliczyła - " + calculateSeries(n));
    }

    //metoda obliczająca sumę odwrotności kolejnych liczb naturalnych
    //metoda zwraca wynik jako liczbę typu float
    public static float calculateSeries(int n) {
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0f /i;
        }
        return sum;
    }

}
