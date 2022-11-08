package zad3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Deklaracja zmiennej a
        int a;
        //Deklaracja zmiennej b
        int b;
        //Deklaracja zmiennej c
        int c;

        //Utowrzenie skanera
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wartość a = ");
        //Skaner przyjmuje liczbe typu int od użytkownika
        a = scanner.nextInt();

        System.out.print("Podaj wartość b = ");
        //Skaner przyjmuje liczbe typu int od użytkownika
        b = scanner.nextInt();

        System.out.print("Podaj wartość c = ");
        //Skaner przyjmuje liczbe typu int od użytkownika
        c = scanner.nextInt();

        //Obliczenie delty
        double delta = Math.pow(b, 2) - 4 * a * c;

        //Obliczenie x1 oraz x2
        double x_1 = (-b - Math.sqrt(delta)) / (2 * a);
        double x_2 = (-b + Math.sqrt(delta)) / (2 * a);

        //Wyświetlenie wyniku
        System.out.printf("Rozwiązania równania to x1 = %f oraz x2 = %f%n", x_1, x_2);


        //ROZWIĄZANIE OBIEKTOWE

        //Utworzenie obiektu typu QuadraticEquation
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 0 ,-9);
        //Wywołanie metody rozwiązującej równanie kwadratowe
        quadraticEquation.calculateSolution();

    }
}
