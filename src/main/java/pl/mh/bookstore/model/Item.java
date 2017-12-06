package pl.mh.bookstore.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import pl.mh.bookstore.domain.Book;
import pl.mh.bookstore.repository.BookRepository;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
public class Item {

    private Integer quantity;

    private String name;

    private BigDecimal price;

    StringBuilder stringBuilder = new StringBuilder();

    public String nameBuilder(Book book){
        stringBuilder.append(book.getAuthor());
        stringBuilder.append(" - ");
        stringBuilder.append("\"");
        stringBuilder.append(book.getTitle());
        stringBuilder.append("\"");
        return stringBuilder.toString();
    }

    public BigDecimal calcualteTotalCost(){
        return price.multiply(new BigDecimal(quantity));
    }

    public void incrementQuantity(){
        ++quantity;
    }
}
