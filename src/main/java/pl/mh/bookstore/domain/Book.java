package pl.mh.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
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

    @Column(columnDefinition = "TEXT")
    private String description;

    @OneToMany(mappedBy = "book")
    private List<Review> reviews = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private BookCategory bookCategory;
}
