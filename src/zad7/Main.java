package zad7;

public class Main {

    public static void main(String[] args) {

        //Utworzenie obiektu
        Fibonacci fibonacci = new Fibonacci(7);

        //Wyświetlenie wyniku metody calculateElement()
        System.out.println(fibonacci.calculateElement());

        //Zmienna z wynikiem metody statycznej calculateElementRecursion()
        int result = Fibonacci.calculateElementRecursion(5);

        //Wyświetlenie zmiennej result
        System.out.println(result);
    }

}
