package zad9;

public class Main {

    public static void main(String[] args) {

        //długość fali, liczba trójkątów
        int size = 5;

        //liczba spacji pomiędzy gwiazdkami tej samej fali
        int spaceBetween = 6;
        //liczba spacji pomiędzy gwiazdkami osobnych fal
        int spaceBefore = 1;

        //pętla fale o wysokiści 4
        for (int j = 0; j < 4; j++) {

            //pętla rysująca fale linia po linii
            for (int i = 0; i < size; i++) {

                //pętla drukująca spacje pomiędzy osobnymi falami
                for (int x = 0; x < spaceBefore - 1; x++) {
                    System.out.print(" ");
                }

                //kolejna gwizdka w rzędzie
                System.out.print("*");

                //pętla drukująca spacja pomiędzy gwiazdkami jednej fali
                for (int y = 0; y < spaceBetween; y++) {
                    System.out.print(" ");
                }

                //kolejna gwiazdka
                System.out.print("*");

                //pętla drukująca spacje pomiędzy osobnymi falami
                for (int x = 0; x < spaceBefore; x++) {
                    System.out.print(" ");
                }
            }

            //złamanie wiersza
            System.out.print("\n");

            //modyfikacja odległości pomiędzy gwiazdkami wewnątrz fali i pomiędzy falami
            spaceBetween = spaceBetween - 2;
            spaceBefore = spaceBefore + 1;


        }
    }
}
