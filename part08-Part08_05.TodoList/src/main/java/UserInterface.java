
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {

    private TodoList todoList;
    private Scanner scan;

    public UserInterface(TodoList todolist, Scanner scan) {
        this.todoList = todolist;
        this.scan = scan;

    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String command = scan.nextLine();

            if (command.equals("stop")) {
                break;
            }

            
            if(command.equals("add")){
                System.out.println("To add: ");
                String toAdd = scan.nextLine();
            
                this.todoList.add(toAdd);
                
            
            }
            
            if(command.equals("list")){
            this.todoList.print();
            
            }
            
            if(command.equals("remove")){
                System.out.println("Which one is removed? ");
                int removedId = Integer.valueOf(scan.nextLine());
                
                this.todoList.remove(removedId);
                
            }
            
            
        }

    }

}
