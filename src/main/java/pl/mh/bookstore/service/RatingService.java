package pl.mh.bookstore.service;

import org.springframework.stereotype.Repository;
import pl.mh.bookstore.domain.Book;
import pl.mh.bookstore.domain.Rating;
import pl.mh.bookstore.domain.RatingDto;

public interface RatingService {
    Rating save(RatingDto ratingDto, Book book);
}
