import java.util.ArrayList;
public class Library {


     ArrayList<Book> books = new ArrayList<>();


     public void addBook(Book book){
         books.add(book);
     }
     public void removeBook(Book book){
         books.remove(book);
         book.setBookcount(book.getBookcount()-1);
     }

     public void printBookInfo(Book book){
         System.out.println("Title: "+ book.getTitle() + " Description: " + book.getDescription() + " Author: " + book.getAuthor() + " Page: " + book.getPage() + " Price: " + book.getPrice() + " Type: " + book.getType());
     }
}
