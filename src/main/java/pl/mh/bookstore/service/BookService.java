package pl.mh.bookstore.service;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import pl.mh.bookstore.domain.Book;
import pl.mh.bookstore.domain.BookDto;


import java.util.Collection;

public interface BookService {
    Book save(BookDto bookDto);
    Collection<Book> findAllBooks();
    Book findById(long id);
    void deleteBook(Book book);
    Book editBook(Book book, BookDto bookDto);
    boolean isInStock(Long id);
}
