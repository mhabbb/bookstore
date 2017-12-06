package pl.mh.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Book extends AuditEntity {
    @Id
    @GeneratedValue
    private Long id;


    private String title;

    private String author;

    private Integer quantity;

    private BigDecimal price;

    private String description;

    @OneToMany(mappedBy = "book")
    private Set<Review> reviewsList;


    @Enumerated(EnumType.STRING)
    private BookCategory bookCategory = BookCategory.TODO;
}
