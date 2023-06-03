import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
  private List<Book> books = new ArrayList<>();
  private User user;
  private double totalPrice;

  public ShoppingCart(User user) {
    this.user = user;
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public void removeBook(Book book) {
    books.remove(book);
  }

  public void updateBook(Book book) {
    books.set(books.indexOf(book), book);
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }

  public User getUser() {
    return user;
  }

  public double getTotalPrice() {
    // loop through books and add price
    for (Book book : books) {
      totalPrice += book.getPrice();
    }
    return totalPrice;
  }

  public void setUser(User user) {
    this.user = user;
  }

  // toString 
  @Override
  public String toString() {
    return "ShoppingCart [books=" + books + ", totalPrice=" + totalPrice + ", user=" + user + "]";
  }

}
