package Algorithms.ThirtyDaysOfCode;

import java.util.Scanner;

/**
 * Created by sajid on 26-Apr-17 at 10:07 PM.
 *
 Sample Input

 The following input from stdin is handled by the locked stub code in your editor:

 The Alchemist
 Paulo Coelho
 248

 Sample Output

 The following output is printed by your display() method:

 Title: The Alchemist
 Author: Paulo Coelho
 Price: 248
 */
abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
class MyBook extends Book{
    /**
     *   Class Constructor
     *
     *   @param title The book's title.
     *   @param author The book's author.
     *   @param price The book's price.
     **/
    int price;
    // Write your constructor here
    public MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }
    /**
     *   Method Name: display
     *
     *   Print the title, author, and price in the specified format.
     **/
    // Write your method here
    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }

}// End class
public class Day13_AbstractClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
