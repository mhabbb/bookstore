package pl.mh.bookstore.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
public class ReviewDto {
    @Min(1)
    @Max(5)
    private Double rate;

    @NotEmpty
    private String text;
}
