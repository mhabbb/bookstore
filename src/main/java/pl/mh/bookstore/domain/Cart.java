package pl.mh.bookstore.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    private List<Item> itemList = new ArrayList<>();
    private BigDecimal summaryPrice = new BigDecimal(0);

    public void addItem(Book book){
        Item item = new Item();
        item.setName(item.nameBuilder(book));
        item.setQuantity(1);
        item.setTotalPrice(book.getPrice());
        itemList.add(item);
    }

    public void deleteItem(Item item){
        itemList.remove(item);
    }

    public BigDecimal getSummaryPrice(){
        for(Item item: itemList){
            summaryPrice = summaryPrice.add(item.getTotalPrice());
        }
        return summaryPrice;
    }
}
