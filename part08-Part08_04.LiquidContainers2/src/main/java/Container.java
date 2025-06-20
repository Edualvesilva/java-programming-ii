
public class Container {

    private int totalLiquid;

    public Container() {
        this.totalLiquid = 0;

    }

    public int contains() {
        return this.totalLiquid;
    }

    public void add(int amount) {
        if (amount + this.totalLiquid > 100 || amount > 100) {
            this.totalLiquid = 100;
            return;
        }

        if (amount < 0) {
            return;
        }

        this.totalLiquid += amount;

    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        if (amount > this.totalLiquid) {
            this.totalLiquid = 0;
            return;
        }

        this.totalLiquid -= amount;

    }

    public String toString() {

        return this.totalLiquid + "/100";
    }

}
