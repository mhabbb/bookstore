package pl.mh.bookstore.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order extends AuditEntity {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String address;

    @NotEmpty
    private Date createdDate;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;

    private Status status;

    private BigDecimal summaryPrice;

    private Set<Book> books;
}
