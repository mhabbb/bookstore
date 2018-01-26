package pl.mh.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mh.bookstore.domain.Address;
import pl.mh.bookstore.domain.Payment;
import pl.mh.bookstore.domain.User;
import pl.mh.bookstore.exception.NotEnoughProductsInStockException;
import pl.mh.bookstore.repository.PaymentRepository;

@Service
public class PaymentServiceImpl {
    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    ShoppingCartService shoppingCartService;

    @Autowired
    UserService userService;

    public void completePayment() {
        Payment payment = new Payment();
        User currentUser = userService.currentUser();
        payment.setBooks(shoppingCartService.getBooksInCart().keySet());
        payment.setTotalCost(shoppingCartService.getTotal());
        payment.setUser(currentUser);
        if(currentUser.getAddress()==null){
            Address address = new Address();
            address.setAddress(address.getAddress());
            address.setLocality(address.getLocality());
            address.setZipCode(address.getZipCode());
        }else{
            payment.setAddress(currentUser.getAddress());
        }
        paymentRepository.save(payment);
    }
}
