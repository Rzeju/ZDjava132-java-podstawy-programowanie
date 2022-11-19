package zad19;

//klasa Author, definiuje autora wiersza
public class Author {

    //prywatne pole z nazwiskiem
    private String surname;
    //prywatne pole z narodowością
    private String nationality;

    //konstruktor z dwoma argumentami
    //tworzy obiekt typu Author i inicjalizuje jego pola przekazanymi wartościami
    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    //konstruktor bezargumentowy
    //tworzy obiekt typu autor ale nie incjalizuje jego pól
    public Author() {

    }

    //getter dla pola surname
    //zwraca wartość pola surname
    public String getSurname() {
        return surname;
    }

    //setter dla pola surname
    //ustawia nową wartość dla pola surname
    public void setSurname(String surname){
        this.surname = surname;
    }

    //getter dla pola nationality
    //zwraca wartość pola nationality
    public String getNationality() {
        return nationality;
    }

    //setter dla pola nationality
    //ustawia nową wartość dla pola nationality
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
