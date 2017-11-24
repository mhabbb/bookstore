package pl.mh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mh.bookstore.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    Book findById(long id);
}
