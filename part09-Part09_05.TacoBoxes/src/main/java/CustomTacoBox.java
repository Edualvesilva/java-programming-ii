
public class CustomTacoBox implements TacoBox {

    private int tacos;

    public CustomTacoBox(int customNumberOfTacos) {
        this.tacos = customNumberOfTacos;

    }

    public int tacosRemaining() {
        return this.tacos;
    }

    public void eat() {
        if (this.tacos - 1 < 0) {
            return;

        }

        this.tacos -= 1;

    }

}
