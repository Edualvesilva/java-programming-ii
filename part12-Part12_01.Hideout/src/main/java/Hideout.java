
import java.util.ArrayList;

public class Hideout<T> {

    private ArrayList<T> box;

    public Hideout() {
        this.box = new ArrayList<>();

    }

    public void putIntoHideout(T toHide) {
        if (this.box.equals(toHide)) {
            this.box.clear();
            return;
        }

        this.box.add(toHide);
    }

    public T takeFromHideout() {

        if (this.box.isEmpty()) {
            return null;
        }

        T saveObject = this.box.get(0);

        this.box.clear();
        return saveObject;
    }

    public boolean isInHideout() {
        if (!this.box.isEmpty()) {
            return true;
        }

        return false;

    }

}
