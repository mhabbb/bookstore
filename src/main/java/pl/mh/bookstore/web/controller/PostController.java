package pl.mh.bookstore.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.mh.bookstore.domain.Book;
import pl.mh.bookstore.domain.Review;
import pl.mh.bookstore.domain.User;
import pl.mh.bookstore.dto.ReviewDto;
import pl.mh.bookstore.service.BookService;
import pl.mh.bookstore.service.ReviewService;

import javax.validation.Valid;

@PreAuthorize("hasRole('ROLE_USER')")
@Controller
public class PostController {
    @Autowired
    private BookService bookService;

    @Autowired
    private ReviewService reviewService;

    private static final StringBuilder sb = new StringBuilder();

    @PostMapping("/books/{id}")
    public String rate(@PathVariable("id") Long id, @ModelAttribute("review") @Valid ReviewDto reviewDto, BindingResult result){
        Book book = bookService.findById(id);
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        reviewDto.setAuthor(username);
        reviewDto.setBook(book);
        reviewDto.setRate(3.0);
        reviewService.save(reviewDto, book);
        if(result.hasErrors()) return "bookDetails";
        return "redirect:/books/{id}";
    }

    @GetMapping("/books/{id}")
    public String bookDetails(@PathVariable("id")Long id, Model model){
        Book book = bookService.findById(id);
        model.addAttribute("bookDetails", book);
        model.addAttribute("review", new ReviewDto());

        return "bookDetails";
    }
}
