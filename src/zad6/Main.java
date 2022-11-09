package zad6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę = ");
        int n = scanner.nextInt();

        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0f /i;
        }

        System.out.println("Suma szeregu harmonicznego wynosi = " + sum);


        System.out.println("Metoda wyliczyła - " + calculateSeries(n));
    }


    public static float calculateSeries(int n) {
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0f /i;
        }
        return sum;
    }

}
