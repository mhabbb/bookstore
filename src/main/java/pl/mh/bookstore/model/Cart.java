package pl.mh.bookstore.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import pl.mh.bookstore.domain.Book;
import pl.mh.bookstore.repository.BookRepository;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cart implements Serializable{

    private List<Item> items = new ArrayList<>();
    private BigDecimal totalPrice;

    @Autowired
    BookRepository bookRepository;




}
