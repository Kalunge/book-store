import java.util.ArrayList;
import java.util.List;

class BookStore {
    
  private List<Book> books = new ArrayList<>();


  public void addBook(Book book) {
    books.add(book);
  }

  public void updateBook(Book book) {
    books.set(books.indexOf(book), book);
  }

  public void removeBook(Book book) {
    books.remove(book);
  }

  public List<Book> getBooks() {
    return books;
  }



}