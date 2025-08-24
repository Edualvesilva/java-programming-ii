package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean temperature;

    public TemperatureSensor() {
        this.temperature = false;
    }

    public boolean isOn() {
        if (this.temperature == true) {
            return true;
        } else {
            return false;
        }
    }

    public void setOff() {
        this.temperature = false;
    }

    public void setOn() {
        this.temperature = true;
    }

    public int read() {
        if (this.isOn()) {
            int randomNumber = new Random().nextInt(61);
            return randomNumber - 30;
        } else {
            throw new IllegalArgumentException();
        }
    }

}
