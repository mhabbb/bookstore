package pl.mh.bookstore.domain;

import java.util.Date;

public interface Auditable<T> {
    Date getCreationDate();

    void setCreationDate(Date date);

    Date getModificationDate();

    void setModificationDate(Date date);

}
