package pl.mh.bookstore.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.math.BigDecimal;

@MappedSuperclass
@Getter
@Setter
public class ProductEntity {
    @Id
    @GeneratedValue
    private Long id;

    private Integer quantity;

    private BigDecimal price;
}
