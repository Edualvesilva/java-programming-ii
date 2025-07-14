
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();

    }

    public void add(String product, int price) {
        if (this.items.containsKey(product)) {
            this.items.get(product).increaseQuantity();
            return;
        }

        this.items.put(product, new Item(product, 1,price));
    }

    public int price() {
        int sum = 0;
        for (Item i : this.items.values()) {
            sum += i.price();
        }

        return sum;
    }

    public void print() {
        for (Item v : this.items.values()) {
            System.out.println(v);

        }

    }
}
