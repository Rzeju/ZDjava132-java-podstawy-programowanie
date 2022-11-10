package zad8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Utworzenie skanera
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę = ");
        //Wprowadzenie przez użytkownika pierwszej liczby do działania
        float number_1 = scanner.nextFloat();
        System.out.print("Podaj znak działania: ");
        //Przekazanie przez użytkownika znaku działania
        char sign = scanner.next().charAt(0);
        System.out.print("Podaj drugą liczbę = ");
        //Wprowadzenie przez użytkownika drugiej liczby do działania
        float number_2 = scanner.nextFloat();

        //ROZWIĄZANIE ZADANIE PRZY UYCIU SWITCH'a
        System.out.println("Kalkulator na switch'u");
        //instrukcja switch
        switch (sign) {
            //przypadek dla dodawania
            case '+':
                System.out.println("Wynik dodawania = " + (number_1 + number_2));
                break;
            //przypadek dla odejmowania
            case '-':
                System.out.println("Wynik odejmowania = " + (number_1 - number_2));
                break;
            //przypadek dla mnożenia
            case '*':
                System.out.println("Wynik mnożenia = " + (number_1 * number_2));
                break;
            //przypadek dla dzielenia
            case '/':
                //sprawdzenieczy dzielnia jest zerem (nie wolno dzielić przez zero!!)
                if (number_2 == 0) {
                    System.out.println("Błąd");
                } else {
                    System.out.println("Wynik dzielenia = " + (number_1 / number_2));
                }
                break;
            //blok default (wszystkie pozostałe przypadki poza 4 wyróżnionymi znakami)
            //blok default jest wykonywany w przypadku jeśli nie zostanie wywołany żaden case
            default :
                System.out.println("Błędny znak");
                break;
        }


        //ROZWIĄZANIE ZADANIA PRZY UŻYCIU IF'a
        System.out.println("Kalkulator na if");

        //przypadek dla dodawania
        if (sign == '+') {
            System.out.println("Wynik dodawania = " + (number_1 + number_2));
        //przypadek dla odejmowania
        } else if (sign == '-') {
            System.out.println("Wynik odejmowania = " + (number_1 - number_2));
        //przypadek dla mnożenia
        } else if (sign == '*') {
            System.out.println("Wynik mnożenia = " + (number_1 * number_2));
        //przypadek dla dzielenia
        } else if (sign == '/') {
            //sprawdzenieczy dzielnia jest zerem (nie wolno dzielić przez zero!!)
            if (number_2 == 0) {
                System.out.println("Błąd");
            } else {
                System.out.println("Wynik dzielenia = " + (number_1 / number_2));
            }
        //else wywoła się dla wszystkich pozostałych przypadków poza 4 wyróżnionymi znakami
        //jeżeli nie zostanie spełniony warunek przy if oraz żadnych z else if
        } else {
            System.out.println("Błędny znak");
        }
    }
}
