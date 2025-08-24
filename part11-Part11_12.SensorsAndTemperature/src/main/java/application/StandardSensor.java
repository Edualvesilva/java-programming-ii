package application;

public class StandardSensor implements Sensor {

    private int sensorNumber;

    public StandardSensor(int sensorNumber) {
        this.sensorNumber = sensorNumber;
    }

    public boolean isOn() {
        return true;
    }

    public void setOff() {
    }

    public void setOn() {
    }

    public int read() {
        return this.sensorNumber;
    }

}
