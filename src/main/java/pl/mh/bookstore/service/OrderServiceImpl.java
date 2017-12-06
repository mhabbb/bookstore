package pl.mh.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mh.bookstore.domain.Book;
import pl.mh.bookstore.model.Item;
import pl.mh.bookstore.repository.BookRepository;
import pl.mh.bookstore.repository.OrderRepository;
import pl.mh.bookstore.repository.UserRepository;

import java.math.BigDecimal;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private BookRepository bookRepository;

}
