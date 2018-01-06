package pl.mh.bookstore.service;

import pl.mh.bookstore.domain.Book;
import pl.mh.bookstore.domain.Review;
import pl.mh.bookstore.dto.ReviewDto;

public interface ReviewService {
    Review save(ReviewDto reviewDto, Book book);
}
