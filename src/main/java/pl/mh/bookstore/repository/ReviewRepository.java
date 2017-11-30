package pl.mh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mh.bookstore.domain.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}
