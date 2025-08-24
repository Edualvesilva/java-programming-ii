package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private List<Integer> averageReadings = new ArrayList<>();

    public AverageSensor() {
        this.sensors = new ArrayList<>();
    }

    public boolean isOn() {
        for (Sensor s : this.sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    public void setOff() {
        for (Sensor s : this.sensors) {
            s.setOff();
        }
    }

    public void setOn() {
        for (Sensor s : this.sensors) {
            s.setOn();
        }
    }

    public int read() {

        if (!isOn()) {
            throw new IllegalArgumentException();
        }

        if (this.sensors.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int sum = 0;
        int avg = 0;
        for (Sensor s : this.sensors) {
            sum += s.read();

        }
        avg = sum / this.sensors.size();
        this.averageReadings.add(avg); 
        return avg;

    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return this.averageReadings;
    }

}
