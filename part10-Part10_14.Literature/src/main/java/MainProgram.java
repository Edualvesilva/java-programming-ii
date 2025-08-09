
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BookInfo> bookList = new ArrayList<>();

        int numBooks = 0;

        while (true) {

            System.out.println("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();

            if (bookName.equals("")) {
                System.out.println(numBooks + " books in total.");
                break;
            }

            System.out.println("Input the age recommendation: ");
            int ageRec = Integer.valueOf(scanner.nextLine());
            numBooks++;

            bookList.add(new BookInfo(bookName, ageRec));

        }

        Comparator<BookInfo> comparator = Comparator.comparing(BookInfo::getBookRec).thenComparing(BookInfo::getBookName);

        Collections.sort(bookList, comparator);

        System.out.println("Books:");
        for (BookInfo book : bookList) {
            System.out.println(book);
        }

    }

}
