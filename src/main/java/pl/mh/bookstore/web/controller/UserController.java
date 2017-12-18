package pl.mh.bookstore.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.mh.bookstore.domain.Book;
import pl.mh.bookstore.domain.Rating;
import pl.mh.bookstore.dto.RatingDto;
import pl.mh.bookstore.service.BookService;
import pl.mh.bookstore.service.RatingService;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private BookService bookService;

    @Autowired
    private RatingService ratingService;

    @GetMapping("/books")
    public String getAllBooks(Model model){
        model.addAttribute("books", bookService.findAllBooks());
        return "booksList";
    }

    @ResponseBody
    @GetMapping("/books/rate")
    public Rating rate(@RequestParam("id") Long id, @Valid RatingDto ratingDto){
        Book book = bookService.findById(id);
        Rating rating = new Rating();
        rating.setBook(book);
        rating.setRate(ratingDto.getRate());
        ratingService.save(ratingDto);
        return rating;
    }

}
