
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();

    }

    public void add(double status) {

        this.history.add(status);

    }

    public void clear() {
        this.history.clear();
    }

    // override
    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        double maxValue = 0;

        if (this.history.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < this.history.size(); i++) {
            if (this.history.get(i) > maxValue) {
                maxValue = this.history.get(i);

            }

        }
        return maxValue;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double minValue = this.history.get(0);
        for (int i = 0; i < this.history.size(); i++) {
            if (this.history.get(i) < minValue) {
                minValue = this.history.get(i);
            }

        }
        return minValue;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }

        double sum = 0;
        double avg = 0;

        for (int i = 0; i < this.history.size(); i++) {
            sum = sum + this.history.get(i);

        }
        avg = sum / this.history.size();
        return avg;
    }

}
