package zad12;

public class Main {

    public static void main(String[] args) {

        //tekst do sprawdzenia
        String text = " 123  570 ";

        //podzielenie tekstu na tablicę Stringów
        //każdy znak będzie oddzielnym elementem tej tablicy
        String[] signs = text.split("");

        //zmienna przechowująca liczbę spacji
        int spaces= 0;
        for(int i= 0; i < signs.length; i++){
            //sprawdzenie czy koljeny element tablicy jest spacją
            if (signs[i].equals(" ")) {
                //zwiększe liczbnika spacji o 1 (inkrementacja)
                spaces++;
            }
        }

        //obliczenie stosunku liczby spacji do wszystkich znaku w tekście (wynik w procentach)
        float result = 100f * spaces / text.length();

        //wypisanie wyniku na ekran
        System.out.printf("Spacje stanowią %.2f%% tekstu", result);
    }
}
