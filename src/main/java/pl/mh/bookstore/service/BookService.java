package pl.mh.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mh.bookstore.domain.Book;
import pl.mh.bookstore.domain.BookDto;
import pl.mh.bookstore.repository.BookRepository;

import java.util.Collection;

public interface BookService {
    Book save(BookDto bookDto);
    Collection<Book> findAllBooks();
    Book findById(long id);
    void deleteBook(Book book);
}
