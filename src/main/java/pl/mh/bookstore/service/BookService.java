package pl.mh.bookstore.service;


import org.springframework.data.domain.Page;
import pl.mh.bookstore.domain.Book;
import pl.mh.bookstore.dto.BookDto;


import java.util.Collection;

public interface BookService {
    Book save(BookDto bookDto);
    Iterable<Book> findAllBooks();
    Book findById(long id);
    void deleteBook(Book book);
    Book editBook(Book book, BookDto bookDto);
    Page<Book> searchBooks(Integer pageNumber, String option);
    Page<Book> viewBooks(Integer pageNumber);
}
