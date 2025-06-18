
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isInteger = false;

        int cube = 0;
        while (true) {
            String userString = scanner.nextLine();

            if (userString.equals("end")) {

                break;
            }

            isInteger = true;

            if (isInteger == true) {
                int number = Integer.valueOf(userString);

                cube = number * number * number;
                System.out.println(cube);
            }

        }

    }
}
