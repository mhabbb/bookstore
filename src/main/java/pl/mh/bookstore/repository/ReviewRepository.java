package pl.mh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.mh.bookstore.domain.Review;

@Repository
public interface ReviewRepository extends PagingAndSortingRepository<Review, Long> {

}
