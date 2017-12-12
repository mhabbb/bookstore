package pl.mh.bookstore.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import pl.mh.bookstore.BookstoreApplication;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
public class AuditEntity implements Auditable<User> {
    @Id
    @GeneratedValue
    private Long id;

    protected Date creationDate;

    protected Date modificationDate;

    @PrePersist
    public void prePersist() {
        setCreationDate(new Date());
        preUpdate();
    }

    @PreUpdate
    public void preUpdate() {
        setModificationDate(new Date());
    }
}