package pl.mh.bookstore.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.mh.bookstore.service.PaymentServiceImpl;

@Controller
public class PaymentController {
    @Autowired
    PaymentServiceImpl paymentService;

    @GetMapping("/payment")
    public String paymentDetails(){
        return "payment";
    }

    @GetMapping("/payment/confirm")
    public String completePurchase(){
        paymentService.completePayment();
        return "redirect:/books";
    }

}
