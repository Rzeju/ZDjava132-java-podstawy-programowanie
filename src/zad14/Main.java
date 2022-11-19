package zad14;

public class Main {

    public static void main(String[] args) {

        //pierwszy argument
        char firstLetter = 'a';
        //drugi argument
        char secondLetter = 'z';

        //warunek sprawdzający czy podane litery są małe i z przedziału a-z
        //wartości liczbowe znaków zaciągnięte z tablicy ASCII
        if ((firstLetter < 97 || firstLetter > 122) || (secondLetter < 97 || secondLetter > 122)){
            //wypisanie informacji o błędnie wprowadzonych literach
            System.out.println("Podaj tylko małe litery");
        } else {
            //obliczenie liczby znaków pomiędzy przekazanymi literami
            int result = Math.abs(firstLetter - secondLetter) - 1;
            //wyświetlenie wyniku na ekran
            System.out.println("Liczba znaków pomiędyz literami wynosi: " + result);
        }
    }
}
