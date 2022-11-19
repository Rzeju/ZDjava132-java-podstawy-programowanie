package zad16;

public class Main {

    public static void main(String[] args) {

        //liczby wprowadzone przez użytkownia
        int[] numbers = {1, 3, 8, 4, 2, 5, 6, 11, 13, 7, 8, 9, 10, 11, 12, 13, 14, 2, 5};

        //licznik dla podciągu rosnącego
        int counter = 0;
        //zmienna przetrzymująca wynik
        int result = 0;

        //pętla przechodząca przez całą tablicę 'numbers'
        for (int i= 0; i < numbers.length - 1; i++) {
            //porównanie ze sobą kolejnych liczb w tablicy
            if (numbers[i] < numbers[i + 1]) {
                //jeżeli kolejna liczba jest większa, zwiększ licznik (podciąg jest rosnący)
                counter++;
            } else {
                //jeżeli podciąg rosnący się kończy porównaj licznik z długością obecnie najdłuższego podciągu
                if (counter >= result) {
                    //przypisanie do wyniku liczni z dla dłuższego ciągu i dodanie 1 (ostatni element to również element ciągu)
                    result = counter + 1;
                }
                //reset licznika dla kolejnego podciągu
                counter = 0;
            }
        }

        //sprawdzenie licznika dla ostatniego podciągu w tablicy
        //jeżeli ostatni podciąg jest rosnący else nie zostanie wykonane
        if (counter >= result) {
            result = counter + 1;
        }

        //wypisanie wyniku
        System.out.println("Najdłużsyz podciąg wynosi: " + result);
    }
}
