package pl.mh.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book extends ProductEntity {
    private String title;

    private String author;

    @Enumerated(EnumType.STRING)
    private BookCategory bookCategory = BookCategory.TODO;
}
