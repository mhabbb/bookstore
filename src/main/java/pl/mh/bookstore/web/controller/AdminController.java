package pl.mh.bookstore.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.mh.bookstore.domain.BookDto;
import pl.mh.bookstore.service.BookService;
import pl.mh.bookstore.service.UserService;
import pl.mh.bookstore.service.UserServiceImpl;

import javax.validation.Valid;

@Controller
public class AdminController {
    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    @GetMapping("/admin/users")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.findAllUsers());
        return "usersList";
    }

    @GetMapping("/admin/books")
    public String getAllBooks(Model model){
        model.addAttribute("books", bookService.findAllBooks());
        return "booksList";
    }


    @ModelAttribute("book")
    public BookDto addBookDTO(){
        return new BookDto();
    }

    @GetMapping("/admin/book/add")
    public String showAddBookForm(){
        return "addBook";
    }

    @PostMapping("/admin/book/add")
    public String addBook(@ModelAttribute("book") @Valid BookDto bookDto, BindingResult result){
        if(result.hasErrors()){
            return "addBook";
        }

        bookService.save(bookDto);
        return "redirect:/admin/books";
    }


    /*@GetMapping("/admin/users/{login}")
    public String deleteUser(@PathVariable("login") String login, Model model){
        userService.deleteUserByLogin(login);
        model.addAttribute("usersList", userService.findAll());
        return "usersList";
    }*/

}
