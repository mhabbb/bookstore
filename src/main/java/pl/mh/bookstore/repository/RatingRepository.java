package pl.mh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mh.bookstore.domain.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long> {
}
