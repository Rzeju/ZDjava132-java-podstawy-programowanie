package zad1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Utworzenie skanera doprzyjęcia danych z konsoli użytkownika
        Scanner scanner = new Scanner(System.in);
        //Utworzenie zmiennej i przypisanie do niej zmiennej typu float podanej przez użytkownika
        System.out.print("Podaj średnicę okręgu d = ");
        float diameter = scanner.nextFloat();
        //Obliczenie obwodu koła
        double circlePerimeter = diameter * Math.PI;
        //Wyświetlenie wyniku
        System.out.printf("Obwód okręgu o śrenicy d = %f wynosi - %f%n", diameter, circlePerimeter);


        //ROZWIĄZANIE W PODEJŚCIU OBIEKTOWYM

        //Utowrzenie obiektu typu Circle
        Circle circle_1 = new Circle(1);
        //Utworzenie zmiennej i przypisanie do niej wyniku z metody 'calculatePerimeter()' (obwód koła circle_1)
        double circlePerimeter_1 = circle_1.calculatePerimeter();
        //Wyświetlenie wyniku dla circle_1
        System.out.printf("Obwód okręgu o śrenicy d = %d wynosi - %f%n", 1, circlePerimeter_1);


        //Pobranie od użytkownika średnicy dla obiektu circle_2
        System.out.print("Podaj średnicę okręgu d = ");
        float diameter_2 = scanner.nextFloat();
        //Utowrzenie obiektu typu Circle
        Circle circle_2 = new Circle(diameter_2);
        //Wyświetlenie wyniku dla circle_2
        // w printf wartość obwodu jest pobierana bezpośrednio z wyniku metody (bez dodatkowej zmiennej jak przy circle_1)
        System.out.printf("Obwód okręgu o śrenicy d = %f, wynosi - %f%n", diameter_2, circle_2.calculatePerimeter());









    }
}
