package pl.mh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mh.bookstore.domain.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
