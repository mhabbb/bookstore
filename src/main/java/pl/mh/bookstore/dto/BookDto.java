package pl.mh.bookstore.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;
import pl.mh.bookstore.domain.BookCategory;
import pl.mh.bookstore.domain.Review;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BookDto {
    @NotEmpty
    private String title;

    @NotEmpty
    private String author;

    @NotNull
    private BigDecimal price;

    private Integer quantity;

    private BookCategory bookCategory;

    private List<Review> reviewList = new ArrayList<>();
}
