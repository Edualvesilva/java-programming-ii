
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        this.history.add(initialBalance);
    }

    // override
    public void addToWarehouse(double amount) {

        if (amount < 0) {
            return;

        }
        double result = 0;

        result = (double) super.getBalance() + amount;

        this.history.add(result);

        super.addToWarehouse(amount);

    }

    // override
    public double takeFromWarehouse(double amount) {
        double result = 0;

        result = (double) super.getBalance() - amount;
        this.history.add(result);
        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis() {
        
        System.out.println("Product: "+super.getName());
        System.out.println("History: "+this.history.toString());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());

    }

    public String history() {

        return this.history.toString();
    }

}
