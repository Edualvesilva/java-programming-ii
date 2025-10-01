
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random luck = new Random();

        System.out.println("How many random numbers should be printed? ");

        int userNumber = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i <= userNumber - 1; i++) {
            int randomNumbers = luck.nextInt(11);
            System.out.println(randomNumbers);

        }

    }

}
