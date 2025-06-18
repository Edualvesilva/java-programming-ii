
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double avg = 0;
        int sum = 0;
        int totalNumbers = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0 && totalNumbers == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }

            if (input == 0) {
                avg = (double) sum / totalNumbers;
                System.out.println(avg);
                break;

            }

            if (input < 0) {
                continue;
            }

            sum += input;
            totalNumbers++;

        }

    }
}
