package term_1.set_11_arrays;

import java.util.ArrayList;
public class Problem_2 {
    public static void main(String[] args) {
        Deck deck = new Deck();

        for (int i = 0; i < 4; i++) {
            System.out.println(deck.takeACard().toString());
        }
    }
}
class Deck{
    private ArrayList<Card> cards;
    public Deck(){
        cards = new ArrayList<Card>(52);
        for (String suit: new String[]{"Spades", "Hearts", "Diamonds", "Clubs"}) {
            for (String card: new String[]{"Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"}) {
                cards.add(new Card(suit, card));
            }
        }
    }
    public Card takeACard(){
        int randomIndex = (int) Math.floor(Math.random() * cards.size());
        return cards.remove(randomIndex);
    }
}
class Card{
    public String suit;
    public String card;

    public Card(String suit, String card) {
        this.suit = suit;
        this.card = card;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.card, this.suit);
    }
}