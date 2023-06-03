import java.util.List;

import bookstore_pakage.BookStore;


class Demo {
  public static void main(String[] args) {
    Book bookOne = new Book(123, "Java", "James Gosling", 120, 12);
    Book bookTwo = new Book(123, "Javascript", "James Gosling", 130, 130);
    Book bookThree = new Book(123, "Php", "James Gosling", 140, 102);
    Book bookFour = new Book(123, "Python", "James Gosling", 90, 310);

    bookStore bookStore = new BookStore();


    bookStore.addBook(bookOne);
    bookStore.addBook(bookTwo);
    bookStore.addBook(bookThree);
    bookStore.addBook(bookFour);

    List<Book> books = bookStore.getAllBooks();
    System.out.println("All books in the bookstore");
    books.forEach(book -> System.out.println(book));
  }
}