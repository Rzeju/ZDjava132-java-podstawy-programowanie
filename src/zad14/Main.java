package zad14;

public class Main {

    public static void main(String[] args) {

        char firstLetter = 'a';
        char secondLetter = 'z';

        if ((firstLetter < 97 || firstLetter > 122) || (secondLetter < 97 || secondLetter > 122)){
            System.out.println("Podaj tylko małe litery");
        } else {
            int result = Math.abs(firstLetter - secondLetter) - 1;
            System.out.println("Liczba znaków pomiędyz literami wynosi: " + result);
        }
    }
}
