package zad8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę = ");
        float number_1 = scanner.nextFloat();
        System.out.print("Podaj znak działania: ");
        char sign = scanner.next().charAt(0);
        System.out.print("Podaj drugą liczbę = ");
        float number_2 = scanner.nextFloat();

        System.out.println("Kalkulator na switch'u");
        switch (sign) {
            case '+':
                System.out.println("Wynik dodawania = " + (number_1 + number_2));
                break;
            case '-':
                System.out.println("Wynik odejmowania = " + (number_1 - number_2));
                break;
            case '*':
                System.out.println("Wynik mnożenia = " + (number_1 * number_2));
                break;
            case '/':
                if (number_2 == 0) {
                    System.out.println("Błąd");
                } else {
                    System.out.println("Wynik dzielenia = " + (number_1 / number_2));
                }
                break;
            default :
                System.out.println("Błędny znak");
                break;
        }

        System.out.println("Kalkulator na if");

        if (sign == '+') {
            System.out.println("Wynik dodawania = " + (number_1 + number_2));
        } else if (sign == '-') {
            System.out.println("Wynik odejmowania = " + (number_1 - number_2));
        } else if (sign == '*') {
            System.out.println("Wynik mnożenia = " + (number_1 * number_2));
        } else if (sign == '/') {
            if (number_2 == 0) {
                System.out.println("Błąd");
            } else {
                System.out.println("Wynik dzielenia = " + (number_1 / number_2));
            }
        } else {
            System.out.println("Błędny znak");
        }
    }
}
