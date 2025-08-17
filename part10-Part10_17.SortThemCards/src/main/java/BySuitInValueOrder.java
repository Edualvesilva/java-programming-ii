
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    public int compare(Card c1, Card c2) {
        int suitCompator = c1.getSuit().ordinal() - c2.getSuit().ordinal();

        if (suitCompator != 0) {
            return suitCompator;
        }

        return c1.getValue() - c2.getValue();
    }
}
