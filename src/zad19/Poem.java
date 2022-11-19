package zad19;

//klasa Poem, definiuje wiersz
public class Poem {

    //prywatne pole z obiektem typu Author (przechowuje autora dla dnaego wiersza)
    private Author creator;
    //prywatne pole z liczbą wersów
    private int stropheNumbers;

    //konstruktor z dwoma argumentami
    //tworzy obiekt typu Poem i inicjalizuje jego pola przekazywanymi wartościami
    public Poem(Author creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }

    //konstruktor bezargumentowy
    //tworzy obiekt typu AUthor i inicjalizuje kjego pola przekazanymi wartościami
    public Poem() {

    }

    //getter dla pola creator
    //zwraca wartość pola creator
    public Author getCreator() {
        return creator;
    }

    //setter dla pola creator
    //ustawia nową wartość dla pola creator
    public void setCreator(Author creator) {
        this.creator = creator;
    }

    //getter dla pola stropheNumbers
    //zwraca wartość pola stropheNumbers
    public int getStropheNumbers() {
        return stropheNumbers;
    }

    //setter dla pola stropheNumbers
    //ustawia nową wartość dla pola stropheNumbers
    public void setStropheNumbers(int stropheNumbers){
        this.stropheNumbers = stropheNumbers;
    }
}
