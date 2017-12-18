package pl.mh.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mh.bookstore.domain.Rating;
import pl.mh.bookstore.dto.RatingDto;
import pl.mh.bookstore.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    RatingRepository ratingRepository;

    public Rating save(RatingDto ratingDto) {
        Rating rating = new Rating();
        rating.setRate(ratingDto.getRate());
        return ratingRepository.save(rating);
    }
}
