package zad10;

public class Main {

    public static void main(String[] args) {

        //liczba, której cyfyr będziemy sumować
        int number = 12345;

        //zmienna pokmocnicza do przechowywania wyniku
        int result = 0;
        //kolejna cyfra liczby 'number'
        double nextDigit;
        //zmienna i do pętli (iterator)
        int i = 0;
        //pętla do while (niezależnie od liczby cyfr chcęcy wykonać tę pętla przynajmniej raz -> jedna cyfra)
        do {
            //dostęp do kolejnej cyfry liczby
            //ustawiamy każdą kolejna cyfrę liczby na pozycji jedności
            nextDigit = (number / Math.pow(10, i));
            //dziele z resztę przez 10 zwraca cyfrę jedności liczby
            int box = (int) nextDigit % 10;
            //sumujemy wyniki z reszty z dzielenie przez 10
            result = result + box;
            //inkrementacji i, kolejny krok pętli
            i++;
        //warunek wykonywanai się pętli
        //dopóki cyfra jedności jest większa od 0
        } while (nextDigit > 0);

        //wypisanie wyniku na ekran
        System.out.println(result);


        //ALTERNATYWNE ROZWIĄZANIE

        //zamiana liczby na obiekt typu String
        String digits = String.valueOf(number);
        //utworzenie z obiektu typu String tablicy (każda cyfra będzie oddzielnym elementem tej tablicy)
        String[] numbers = digits.split("");

        //zmienna pokmocnicza do przechowywania wyniku
        result = 0;
        //pętla obliczająca sumę cyfr liczby
        for (int j = 0; j < numbers.length; j++) {
            //każdy kolejny element tablicy jest zamieniany ze Stringa na inta i dodawany do wyniku
            result = result + Integer.parseInt(numbers[j]);
        }

        //wypisanie wyniku na ekran
        System.out.println(result);

    }
}
