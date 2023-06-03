// As a user, I want to be able to view a list of available books in the bookstore.
// As a user, I want to be able to search for books by title or author.
// As a user, I want to be able to add books to my shopping cart.
// As a user, I want to be able to view the contents of my shopping cart.
// As a user, I want to be able to remove books from my shopping cart.
// As a user, I want to be able to place an order for the books in my shopping cart.
// As a user, I want to receive a confirmation email after placing an order.
// As an administrator, I want to be able to add new books to the bookstore.
// As an administrator, I want to be able to update the details of existing books.
// As an administrator, I want to be able to remove books from the bookstore.


public class Book {
  private  int ISBN;
  private  String title;
  private  String author;
  private  double price;
  private  int quantity;

  public Book(int ISBN, String title, String author, double price, int quantity) {
    this.ISBN = ISBN;
    this.title = title;
    this.author = author;
    this.price = price;
    this.quantity = quantity;
  }

  public int getISBN() {
    return ISBN;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setIsbn(int ISBN) {
    this.ISBN = ISBN;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setTitle(String title) {
    this.title = title;
  }

 
  
  public String toString() {
    return "ISBN: " + ISBN + ", Title: " + title + ", Author: " + author + ", Price: " + price + ", Quantity: " + quantity;
  }
  
}
