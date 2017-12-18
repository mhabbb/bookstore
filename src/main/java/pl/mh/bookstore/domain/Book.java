package pl.mh.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book extends AuditEntity {
    private String title;

    private String author;

    private Integer quantity;

    private BigDecimal price;

    private String description;

    @OneToMany(mappedBy = "book")
    private List<Rating> ratings;

    @Enumerated(EnumType.STRING)
    private BookCategory bookCategory;
}
