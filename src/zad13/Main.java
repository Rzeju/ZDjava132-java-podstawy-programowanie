package zad13;

public class Main {

    public static void main(String[] args) {

        //tekst do powtórzenia
        String text = "Ala ma kota";

        //podzielenie tekstu na tablice Stringów (każdy element to odzielne słowo)
        //separatorem jest tutaj spacja
        String[] somethingToSay = text.split(" ");

        //pętla przechodząca przez wszystkie słowa w tablicy
        for (int i = 0; i < somethingToSay.length; i++) {
            //dwukrotne wypisanie na ekran każdego ze słów
            System.out.printf("%s %s ", somethingToSay[i].trim(), somethingToSay[i].trim());
        }
    }
}
