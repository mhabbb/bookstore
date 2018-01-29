package pl.mh.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ShippingService {

    @Autowired
    ShoppingCartService shoppingCartService;

    private BigDecimal bigDecimal = shoppingCartService.getTotal();

    public BigDecimal getCourierShippingCost(){
        if(bigDecimal.intValue()<150) {
            return new BigDecimal(15);
        }
        else{
            return null;
        }
    }

    public BigDecimal getPostShippingCost(){
        if(bigDecimal.intValue()<150){
            return new BigDecimal(10);
        }
        else{
            return null;
        }
    }

}
