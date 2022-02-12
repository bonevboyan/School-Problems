package term_1.set_19_exercises;

public class ChildrenBook extends Book {
    private int age;

    public ChildrenBook(double regularPrice, String publisher, int yearPublished) {
        super(regularPrice, publisher, yearPublished);
    }

    public ChildrenBook(double regularPrice, String publisher, int yearPublished, int age) {
        super(regularPrice, publisher, yearPublished);
        this.age = age;
    }

    public double computeSalePrice(){
        return super.getRegularPrice() * 0.7;
    }
}
