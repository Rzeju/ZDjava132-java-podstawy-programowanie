package zad3;

//Klasa QuadraticEquation - obiekty tej klasy mają w sobie przekazane wartości współczynników
//Obiekty te posiadają metodę calculateSolution(), która rozwiązuje równanie i wypisuje wynik na ekranie
public class QuadraticEquation {

    //prywatne pole klasy współczynnik a
    private int a;
    //prywatne pole klasy współczynnik b
    private int b;
    //prywatne pole klasy współczynnik c
    private int c;

    //konstruktor przyjmujący 3 parametry (współczynniki równania)
    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Metoda rozwiązująca równanie i drukująca wynik na ekranie
    //Metoda ta nie zwraca wyniku (typ zwrotny to void)
    public void calculateSolution() {
        double delta = Math.pow(b, 2) - 4 * a * c;

        double x_1 = (-b - Math.sqrt(delta)) / (2 * a);
        double x_2 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.printf("Rozwiązania równania to x1 = %f oraz x2 = %f%n", x_1, x_2);
    }
}
