package zad19;

public class Main {

    public static void main(String[] args) {

        Author author_1 = new Author("Szymborska", "Polish");
        Author author_2 = new Author();
        author_2.setSurname("Saarikoski");
        author_2.setNationality("Finland");
        Author author_3 = new Author("Kawafis", "Greece");

        Poem poem_1 = new Poem(author_1, 50);
        Poem poem_2 = new Poem(author_2, 200);
        Poem poem_3 = new Poem(author_3, 30);

        Poem[] poems = {poem_1, poem_2, poem_3};

        Poem result = poems[0];
        for (int i = 1; i < poems.length; i++) {
            if(result.getStropheNumbers() < poems[i].getStropheNumbers()) {
                result = poems[i];
            }
        }

        System.out.println("1. Największą liczbę zwrotek napisał/ła " + result.getCreator().getSurname());
    }
}
