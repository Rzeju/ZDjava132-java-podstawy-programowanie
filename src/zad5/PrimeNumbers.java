package zad5;

//klasa PrimeNumbers
public class PrimeNumbers {

    //pole klasy - oznacza zakres rozpatrywanych liczb
    private final int n;

    //konstruktor z jednym argumentem
    public PrimeNumbers(int n) {
        this.n = n;
    }

    //metoda publiczna - wypisuje liczby pierwsze na ekran
    public void writePrimeNumbers() {
        //pętla, która poddaje sprawdzeniu kolejne liczby do n
        for (int i = 2; i < n; i++) {
            //metoda 'isPrimeNumber(i)' sprawdza czy kolejna liczba i jest pierwsza
            //jeśli metoda ta zwróci true dana liczba jest wypisywana na ekranie
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    //metoda prywatna sprawdzający czy przekazana do niej liczba 'number' jest pierwsza
    //metoda ta zwraca wartość logiczną true/false typ boolean
    private boolean isPrimeNumber(int number) {

        //zmienna określająca czy dana liczba jest pierwsza czy nie (inaczej flaga)
        boolean isPrimeNumber = true;

        //pętla sprawdzająca czy kolejne liczby i są dzielnikami liczby number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                //jeżeliznaleziony został jakiś dzielnik, flaga jest ustawiana na false (liczba number nie jest pierwsza)
                isPrimeNumber = false;
                //przerwanie dalszego poszukiwania dzielników, wystarczy, że znajdziemy jeden
                break;
            }
        }

        //zwrócenie wartości przez metodę
        return isPrimeNumber;
    }
}
