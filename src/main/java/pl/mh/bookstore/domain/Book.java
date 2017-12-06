package pl.mh.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
<<<<<<< Updated upstream
=======
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
>>>>>>> Stashed changes

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
<<<<<<< Updated upstream
public class Book extends ProductEntity {
=======
public class Book extends AuditEntity {
    @Id
    @GeneratedValue
    private Long id;

>>>>>>> Stashed changes
    private String title;

    private String author;

<<<<<<< Updated upstream
=======
    private Integer quantity;

    private BigDecimal price;

    private String description;

    @OneToMany(mappedBy = "book")
    private Set<Review> reviewsList;

>>>>>>> Stashed changes
    @Enumerated(EnumType.STRING)
    private BookCategory bookCategory = BookCategory.TODO;
}
