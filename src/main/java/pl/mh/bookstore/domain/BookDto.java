package pl.mh.bookstore.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
public class BookDto {
    @NotEmpty
    private String title;

    @NotEmpty
    private String author;

    @NotNull
    private BigDecimal price;
}
