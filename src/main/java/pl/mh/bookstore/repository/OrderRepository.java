package pl.mh.bookstore.repository;

import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.mh.bookstore.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
