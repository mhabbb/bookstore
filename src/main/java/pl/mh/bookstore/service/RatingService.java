package pl.mh.bookstore.service;

import pl.mh.bookstore.domain.Rating;
import pl.mh.bookstore.dto.RatingDto;

public interface RatingService {
    Rating save(RatingDto ratingDto);
}
