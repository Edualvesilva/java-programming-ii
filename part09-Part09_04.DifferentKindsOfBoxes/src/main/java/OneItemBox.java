
import java.util.ArrayList;

public class OneItemBox extends Box {

    private ArrayList<Item> items;

    public OneItemBox() {
        this.items = new ArrayList<>();
    }

    public void add(Item item) {

        if (this.items.isEmpty()) {
            this.items.add(item);
        } else {
            return;
        }

    }

    public boolean isInBox(Item item) {
        if (this.items.contains(item)) {
            return true;
        }
        return false;
    }

}
