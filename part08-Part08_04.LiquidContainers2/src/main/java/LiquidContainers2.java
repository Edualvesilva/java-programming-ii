
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        System.out.println("First:" + container1);
        System.out.println("Second:" + container2);

        while (true) {

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String parts[] = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                container1.add(amount);

            }

            if (command.equals("move")) {

                if (container1.contains() < amount) {
                    int toMove = container1.contains();
                    container2.add(toMove);
                    container1.remove(toMove);

                } else {
                    container1.remove(amount);
                    container2.add(amount);
                }
            }

            if (command.equals("remove")) {
                container2.remove(amount);

            }

            System.out.println("First:" + container1);
            System.out.println("Second:" + container2);
        }
    }

}
