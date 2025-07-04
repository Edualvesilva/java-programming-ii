
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;

    }

    public void add(Item item) {
        int currentWeight = 0;

        for (Item i : this.items) {
            currentWeight += i.getWeight();
        }

        if (currentWeight + item.getWeight() <= this.capacity) {
            this.items.add(item);
        }

    }

    public boolean isInBox(Item item) {
        if (this.items.contains(item)) {
            return true;
        }

        return false;

    }

}
