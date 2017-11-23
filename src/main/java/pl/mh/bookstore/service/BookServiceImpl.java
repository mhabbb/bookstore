package pl.mh.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import pl.mh.bookstore.domain.Book;
import pl.mh.bookstore.domain.BookDto;
import pl.mh.bookstore.repository.BookRepository;

import java.util.Collection;

public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    public Book save(BookDto bookDto){
        Book book = new Book();
        book.setAuthor(bookDto.getAuthor());
        book.setTitle(book.getTitle());
        book.setPrice(book.getPrice());
        book.setYear(book.getYear());
        book.setBookCategory(book.getBookCategory());
        return bookRepository.save(book);
    }

    @Override
    public Collection<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}
