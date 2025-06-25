
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {

        if (this.owners.containsKey(licensePlate)) {
            return false;

        }

        this.owners.put(licensePlate, owner);
        return true;

    }

    public String get(LicensePlate licensePlate) {

        if (this.owners.containsKey(licensePlate)) {

            return this.owners.get(licensePlate);

        }

        return null;

    }

    public boolean remove(LicensePlate licensePlate) {

        if (this.owners.containsKey(licensePlate)) {
            this.owners.remove(licensePlate);
            return true;

        }

        return false;

    }

    public void printLicensePlates() {

        for (LicensePlate lincesePlate : this.owners.keySet()) {
            System.out.println(lincesePlate);

        }

    }

    public void printOwners() {
        ArrayList list = new ArrayList<>();

        for (String owners : this.owners.values()) {

            if (list.contains(owners)) {
                continue;
            }

            System.out.println(owners);
            list.add(owners);

        }

    }

}
