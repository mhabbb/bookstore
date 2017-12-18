package pl.mh.bookstore.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Item {
    private String name;
    private Integer quantity;
    private BigDecimal totalPrice;

    private StringBuilder stringBuilder = new StringBuilder();

    public String nameBuilder(Book book){
        stringBuilder.append(book.getAuthor());
        stringBuilder.append(" - ");
        stringBuilder.append(book.getTitle());
        return stringBuilder.toString();
    }

    public BigDecimal getTotalPrice() {
        return totalPrice.multiply(new BigDecimal(quantity));
    }

    public Integer incrementQuantity(){
        return ++quantity;
    }

}
