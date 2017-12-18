package pl.mh.bookstore.domain;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
public class RatingDto {
    @Min(1)
    @Max(5)
    private Double rate;
}
