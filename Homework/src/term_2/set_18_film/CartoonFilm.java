package term_2.set_18_film;

public class CartoonFilm extends Film {
    private String characterName;

    public CartoonFilm(int id, String name, int year, double price) {
        super(id, name, year, price);
    }

    public CartoonFilm(int id, String name, int year, double price, String characterName) {
        super(id, name, year, price);
        this.characterName = characterName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public String toString() {
        return super.toString() + " " + characterName;
    }
}
