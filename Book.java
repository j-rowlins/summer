import java.util.Scanner;
public class Book {
    
    String title;
    String author;
    int numberofpages;
}

class BookInputTest
{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter the title of the book:");
String title = scanner.nextLine();

System.out.println("Enter the name of the author:");
String author = scanner.nextLine();

System.out.println("Enter the number of pages of the book:");
int numberofpages = scanner.nextInt();
    
System.out.println("The book title is: " + title);
System.out.println("The author is: " + author);
System.out.println("The book has: " + numberofpages + " pages");

}
}