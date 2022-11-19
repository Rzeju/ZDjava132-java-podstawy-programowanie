package zad19;

public class Main {

    public static void main(String[] args) {

        //Utworzenie obiektu typu Author przy użyciu konstruktora z dwoma argumentami
        Author author_1 = new Author("Szymborska", "Polish");
        //Utworzenie obiektu typu Author przy użyciu konstruktora bezargumentowego
        Author author_2 = new Author();
        //ustawienie pola surname settreem
        author_2.setSurname("Saarikoski");
        //ustawienie pola nationality setterem
        author_2.setNationality("Finland");
        //Utworzenie obiektu typu Author przy użyciu konstruktora z dwoma argumentami
        Author author_3 = new Author("Kawafis", "Greece");

        //Utworzenie obiektu typu Poem przy użyciu konstruktora z dwoma argumentami
        //w konstruktorze przekazano tutaj referencje do obiektu author_1
        Poem poem_1 = new Poem(author_1, 50);
        //Utworzenie obiektu typu Poem przy użyciu konstruktora z dwoma argumentami
        //w konstruktorze przekazano tutaj referencje do obiektu author_2
        Poem poem_2 = new Poem(author_2, 200);
        //Utworzenie obiektu typu Poem przy użyciu konstruktora z dwoma argumentami
        //w konstruktorze przekazano tutaj referencje do obiektu author_3
        Poem poem_3 = new Poem(author_3, 30);

        //Utworzenie tablicy dla obiektów typu Poem
        Poem[] poems = {poem_1, poem_2, poem_3};

        //pętla porównująca długość wierszy dla obiektów typu Poem
        Poem result = poems[0];
        for (int i = 1; i < poems.length; i++) {
            if(result.getStropheNumbers() < poems[i].getStropheNumbers()) {
                result = poems[i];
            }
        }

        //wypisanie nazwiska autora wiersza o największej liczbie wierszy
        System.out.println("1. Największą liczbę zwrotek napisał/ła " + result.getCreator().getSurname());
    }
}
