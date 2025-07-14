
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if (!this.prices.containsKey(product)) {
            return -99;
        }
        return this.prices.get(product);
    }

    public int stock(String product) {
        if (!(this.stock.containsKey(product))) {
            return 0;
        }

        return this.stock.get(product);

    }

    public boolean take(String product) {
        if (!(this.stock.containsKey(product)) || this.stock.get(product) - 1 < 0) {
            return false;
        }

        this.stock.put(product, this.stock.get(product) - 1);
        return true;

    }

    public Set<String> products(){
    Set<String> set = new HashSet<>();
    for(String m : this.prices.keySet()){
        set.add(m);
    }
    
    return set;
    
    }
}
