package pl.mh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import pl.mh.bookstore.domain.Review;

public interface ReviewRepository extends PagingAndSortingRepository<Review, Long> {

}
