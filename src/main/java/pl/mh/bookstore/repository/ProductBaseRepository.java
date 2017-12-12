package pl.mh.bookstore.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import pl.mh.bookstore.domain.Product;

import java.util.List;

@NoRepositoryBean
public interface ProductBaseRepository <T extends Product> extends JpaRepository<T, Long>{
    List<T> findAll();

    List<T> findAll(Sort sort);

    List<T> findAll(Iterable<Long> longs);

    Page<T> findAll(Pageable pageable);

    List<T> findAllByAuthorAndTitle(String author, String title);

    T findOne(Long aLong);
}
