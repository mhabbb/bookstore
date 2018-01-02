package pl.mh.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mh.bookstore.domain.Book;
import pl.mh.bookstore.dto.BookDto;
import pl.mh.bookstore.repository.BookRepository;

import java.util.Collection;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    public Book save(BookDto bookDto) throws RuntimeException{

        if(bookRepository.findAllByAuthorAndTitle(bookDto.getAuthor(), bookDto.getTitle())==null) {
            Book book = new Book();
            book.setAuthor(bookDto.getAuthor());
            book.setTitle(bookDto.getTitle());
            book.setPrice(bookDto.getPrice());
            book.setBookCategory(bookDto.getBookCategory());
            book.setQuantity(bookDto.getQuantity());
            book.setDescription(bookDto.getDescription());
            return bookRepository.save(book);
        }
        else throw new RuntimeException("This book already exists in database");
    }

    @Override
    public Book editBook(Book book, BookDto bookDto) {
        book.setAuthor(bookDto.getAuthor());
        book.setTitle(bookDto.getTitle());
        book.setPrice(bookDto.getPrice());
        book.setBookCategory(bookDto.getBookCategory());
        book.setQuantity(bookDto.getQuantity());
        return bookRepository.save(book);
    }

    @Override
    public Collection<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(long id) {
        return bookRepository.findById(id);
    }

    @Override
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }
}
