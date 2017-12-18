package pl.mh.bookstore.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Rating {
    @Id
    @GeneratedValue
    private long id;

    private Double rate;

    @ManyToOne
    private Book book;

    @ManyToOne
    private User user;
}
