package pl.mh.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mh.bookstore.domain.Book;
import pl.mh.bookstore.domain.BookDto;
import pl.mh.bookstore.repository.BookRepository;
import pl.mh.bookstore.repository.ProductBaseRepository;

import java.util.Collection;
import java.util.List;

@Service
public class BookService{

    @Autowired
    private ProductBaseRepository<Book> bookRepository;

    public Book save(BookDto bookDto) throws RuntimeException{
        Book book = new Book();
        if(bookRepository.findAllByAuthorAndTitle(bookDto.getAuthor(), bookDto.getTitle())==null) {
            book.setAuthor(bookDto.getAuthor());
            book.setTitle(bookDto.getTitle());
            book.setPrice(bookDto.getPrice());
            return bookRepository.save(book);
        }
        else throw new RuntimeException("This book already exists in database");
    }

    public Book editBook(Book book, BookDto bookDto) {
        book.setAuthor(bookDto.getAuthor());
        book.setTitle(bookDto.getTitle());
        book.setPrice(bookDto.getPrice());
        return bookRepository.save(book);
    }

    public List<Book> bookList(){
        return bookRepository.findAll();
    }

    public Book findOne(Long id){
        return bookRepository.findOne(id);
    }

    public void deleteBook(Book book){
        bookRepository.delete(book);
    }

    public boolean isInStock(Long id) {
        Book book = bookRepository.findOne(id);
        if(book.getQuantity()>0) return true;
        else return false;
    }
}
