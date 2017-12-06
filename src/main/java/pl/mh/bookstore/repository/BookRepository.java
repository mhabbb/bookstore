package pl.mh.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.mh.bookstore.domain.Book;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    Book findById(long id);
    Book findAllByAuthorAndTitle(String title, String author);
}
