package pl.mh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.mh.bookstore.domain.Book;

@Repository
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
    Book findById(long id);
    Book findAllByAuthorAndTitle(String title, String author);
}
