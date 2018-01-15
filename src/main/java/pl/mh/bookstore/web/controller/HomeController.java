package pl.mh.bookstore.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.mh.bookstore.service.BookService;

@Controller
public class HomeController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String booksPage(Model model, @RequestParam(defaultValue = "0") Integer page){
        model.addAttribute("books", bookService.viewBooks(page));
        model.addAttribute("currentPage", page);
        return "booksList";
    }

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("bestRated", bookService.findAllBooks());
        model.addAttribute("mostPopular", bookService.findAllBooks());
        return "index";
    }

    /*@GetMapping("/books")
    public String getBooks(@RequestParam(value = "page") int page, @RequestParam(value = "option") String option, Model model){
        model.addAttribute("booksList", bookService.getPageOfBooks(page, option));
        return "booksList";
    }*/

}
