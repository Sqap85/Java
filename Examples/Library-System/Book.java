public class Book {

   private String Title;
   private String Description;
   private String Author;
   private int Page;
   private double Price;
   private Type type;
   private static int bookcount;

    Book(String title, String author, int page, String description, double price, Type type){
        this.Title = title;
        this.Author = author;
        this.Page = page;
        this.Description = description;
        this.Price = price;
        this.type = type;
        bookcount++;

    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getPage() {
        return Page;
    }

    public double getPrice() {
        return Price;
    }

    public static int getBookcount() {
        return bookcount;
    }

    public String getAuthor() {
        return Author;
    }

    public Type getType() {
        return type;
    }

    public static void setBookcount(int bookcount) {
        Book.bookcount = bookcount;
    }
}
