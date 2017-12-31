package pl.mh.bookstore.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

@Controller
public class PostController {
    @Autowired
    private BookService bookService;

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/books/{id}/add")
    public String rate(@PathVariable("id") Long id, BindingResult result, @ModelAttribute("review") @Valid ReviewDto reviewDto){
        Book book = bookService.findById(id);
        Authentication a = SecurityContextHolder.getContext().getAuthentication();
        User currentUser = (User)a.getPrincipal();
        Review review = new Review();
        review.setBook(book);
        review.setUser(currentUser);
        reviewService.save(reviewDto);
        return "redirect:/books/{id}";
    }

    @GetMapping("/books/{id}")
    public String bookDetails(@PathVariable("id")Long id, Model model){
        Book book = bookService.findById(id);
        model.addAttribute("bookDetails", book);
        model.addAttribute("bookTitle", book.getTitle());
        model.addAttribute("review", new ReviewDto());
        return "bookDetails";
    }
}
