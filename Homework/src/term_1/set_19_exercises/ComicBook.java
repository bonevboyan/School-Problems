package term_1.set_19_exercises;

public class ComicBook extends Book{
    private String characterName;

    public ComicBook(double regularPrice, String publisher, int yearPublished) {
        super(regularPrice, publisher, yearPublished);
    }

    public ComicBook(double regularPrice, String publisher, int yearPublished, String characterName) {
        super(regularPrice, publisher, yearPublished);
        this.characterName = characterName;
    }

    public double computeSalePrice(){
        return super.getRegularPrice() * 0.6;
    }
}
