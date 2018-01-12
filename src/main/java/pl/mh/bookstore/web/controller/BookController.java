package pl.mh.bookstore.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import pl.mh.bookstore.service.BookService;

public class BookController {
    @Autowired
    private BookService bookService;


}
