
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
        int number = scanner.nextInt();
        
        if(number < 0){
        break;
        }
        
        list.add(number);
        
        
        }
   
        list.stream().filter(number -> number > 0 && number <= 5).forEach(value -> System.out.println(value));
        
        
    }
}
