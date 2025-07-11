
import java.util.ArrayList;

public class Box implements Packable{

    private double maximumWeight;

    private ArrayList<Packable> items;

    public Box(double weight) {
        this.maximumWeight = weight;
        this.items = new ArrayList<>();

    }

    public void add(Packable item) {

        double currentWeight = 0;
        for (Packable p : this.items) {
            currentWeight = currentWeight + p.weight();
        }

        if (currentWeight + item.weight() <= this.maximumWeight) {

            this.items.add(item);
        }

    }

    public String toString() {
        double totalWeight = 0;

        for (Packable p : this.items) {

            totalWeight += p.weight();
        }

        return "Box: " + this.items.size() + " items, total weight " + totalWeight + " kg";
    }

    public double weight() {
        double weight = 0;
        for (Packable p : this.items) {
            weight += p.weight();
        }

        return weight;
    }

}
