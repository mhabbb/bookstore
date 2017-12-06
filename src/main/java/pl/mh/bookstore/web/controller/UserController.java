package pl.mh.bookstore.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.mh.bookstore.service.BookService;

@Controller
public class UserController {

    @Autowired
    private BookService bookService;

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/user/books")
    public String getAllBooks(Model model){
        model.addAttribute("books", bookService.findAllBooks());
        return "booksList";
    }

}
