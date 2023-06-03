package bookstore_pakage;
import java.util.ArrayList;
import java.util.List;

import Book;

class BookStore {

    
  private List<Book> books = new ArrayList<>();


  public void addBook(Book book) {
    books.add(book);
  }

  // getallbooks
  public List<Book> getAllBooks() {
    return books;
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

//  display all books
  // public void displayBooks() {
  //   books.forEach(book1 -> System.out.println(book1));
  // }

}