
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);

    }

    public void print() {
        for (Card cards : this.cards) {
            System.out.println(cards);
        }
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    public int compareTo(Hand other) {

        int thisSum = 0;
        int otherSum = 0;

        for (Card c : this.cards) {
            thisSum += c.getValue();
        }
        for (Card c : other.cards) {
            otherSum += c.getValue();
        }

        return thisSum - otherSum;

    }

    public void sortBySuit() {

        this.cards.sort((c1, c2) -> {
            int suitComp = c1.getSuit().ordinal() - c2.getSuit().ordinal();
            if (suitComp != 0) {
                return suitComp;
            }
            return c1.getValue() - c2.getValue();

        });
    }

}
