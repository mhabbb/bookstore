package pl.mh.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

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

    @Enumerated(EnumType.STRING)
    private BookCategory bookCategory = BookCategory.TODO;
}
