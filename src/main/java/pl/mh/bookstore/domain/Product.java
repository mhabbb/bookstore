package pl.mh.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance
public abstract class Product extends AuditEntity{
    @Id
    @GeneratedValue
    private Long id;

    private Integer quantity;

    private BigDecimal price;

    private String description;

    /*@OneToMany(mappedBy = "book")
    private Set<Review> reviewsList;
    */
}
