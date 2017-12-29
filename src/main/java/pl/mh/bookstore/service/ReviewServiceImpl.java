package pl.mh.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mh.bookstore.domain.Review;
import pl.mh.bookstore.dto.ReviewDto;
import pl.mh.bookstore.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    ReviewRepository reviewRepository;

    public Review save(ReviewDto reviewDto) {
        Review review = new Review();
        review.setRate(reviewDto.getRate());
        review.setText(review.getText());
        return reviewRepository.save(review);
    }
}
