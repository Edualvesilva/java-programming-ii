package FlightControl;
import FlightControl.ui.TextUi;
import java.util.Scanner;
import FlightControl.logic.FlightControl;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();
        TextUi textui = new TextUi(flightControl,scanner);
        textui.start();
    }
}
