package pl.mh.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mh.bookstore.domain.Book;
import pl.mh.bookstore.domain.BookDto;
import pl.mh.bookstore.repository.BookRepository;

import java.util.Collection;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    public Book save(BookDto bookDto){
        Book book = new Book();
        book.setAuthor(bookDto.getAuthor());
        book.setTitle(bookDto.getTitle());
        book.setPrice(bookDto.getPrice());
        book.setYear(bookDto.getYear());
        return bookRepository.save(book);
    }

    @Override
    public Collection<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}
