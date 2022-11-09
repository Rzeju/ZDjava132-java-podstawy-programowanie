package zad7;

//klasa posiadająca metody zwracające podany element ciągu Fibonacciego
public class Fibonacci {

    //pole klasowe - określa element ciągu Fibonacciego,który chcemy uzyskać
    private int n;

    //konstruktor z jednym argumentem
    public Fibonacci(int n) {
        this.n = n;
    }

    //metoda obliczająca zadany element ciągu Fibonacciego
    //pozycje tego elementu (jego numer) określa zmienna n
    public int calculateElement() {
        //poprzedni element ciągu
        int previous = 1;
        //obecny element ciągu
        int current = 1;

        //sprawdzenie czy nie chcemy uzyskać 1 lub 2 elementu ciągu (1 i 2 element ciągu wynosi 1)
        if (n > 2) {
            //pętla obliczająca kolejne elementy ciągu do uzyskania zadanego elementu na pozycji n
            for (int i = 2; i < n; i++) {
                //obliczenie kolejnego wyrazu ciągu (suma obecnego i poprzedniego)
                int next = current + previous;
                //przypisanie wartości obecnego elementu do poprzedniego
                previous = current;
                //przypisanie nowo wyliczonego elementu ciągu do obecnego
                current = next;
                //zabieg ten pozwala nam na przechodzenie przez kolejne elementu ciągu
                //jeżeli obecne elementu to previous = 1 oraz current = 1 to kolejny element jest ich sumą czyli 2
                //bo obliczeniu kolejnego elementu 2 staję się on naszym obenym elementem czyli current = 2;
                //na poprzedni element to 1 czyli previous = 1
                //w kolejnym kroku nowy element to 3 (current + previous -> 1 + 2)
                //tym razem naszym obecnym nowo wyliczonym elementem będzie current = 3 a poprzednim previous = 2
            }
        }

        //zwracamy obecny element ciągu
        return current;
    }

    //metoda statyczna - nie potrzeba tworzyć obiektu tej klasy aby ją wywołać
    //oblicza wartość zadanego elementu ciągu Fibonacciego korzystając z rekurencji (metoda wywołuje samą siebie)
    public static int calculateElementRecursion(int n) {

        //elementy 1 oraz 2 mają wartość jeden, zwrcamy wtedy tę wartość
        if (n < 3) {
            return 1;
        }

        //wywołanie rekurencyjne - kolejny element ciągu Fibonacciego to suma dwóch poprzednich stąd (n - 1) oraz (n - 2)
        //każdy wywołanie funkcji będzie zamieniane na wywołanie tej samej funkcji z mniejszy argumentem
        //np calculateElementRecursion(3) = calculateElementRecursion(2) + calculateElementRecursion(1)
        //np calculateElementRecursion(4) = calculateElementRecursion(3) + calculateElementRecursion(2)
        //wywołania te będą następować do momentu aż zostaną rozłożone na te, których wartość algorytm może zwócić
        //czyli do moemntu calculateElementRecursion(2) lub calculateElementRecursion(1) (PATRZ IF tam jest return)
        //na koniec wszystkie wywołania zostaną zsumowane i otrzymamy wynik
        //lepszy opis algorytmu rekurencyjneog przedstawia rysunek z zajęc na kanale JAVA_PODSTAWY na Slacku!!!!
        return calculateElementRecursion(n - 1) + calculateElementRecursion(n - 2);
    }
}
