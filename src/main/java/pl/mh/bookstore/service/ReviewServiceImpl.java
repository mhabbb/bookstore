package pl.mh.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import pl.mh.bookstore.domain.Book;
import pl.mh.bookstore.domain.Review;
import pl.mh.bookstore.dto.ReviewDto;
import pl.mh.bookstore.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    UserService userService;

    private static final int PAGE_SIZE = 10;


    public Review save(ReviewDto reviewDto, Book book) {
        Review review = new Review();
        review.setRate(reviewDto.getRate());
        review.setText(reviewDto.getText());
        review.setUser(userService.currentUser());
        review.setBook(book);
        return reviewRepository.save(review);
    }

    @Override
    public Page<Review> getPageOfReviews(Integer pageNumber, String option) {
        PageRequest request = new PageRequest(pageNumber, PAGE_SIZE, Sort.Direction.DESC, option);
        return reviewRepository.findAll(request);
    }
}
