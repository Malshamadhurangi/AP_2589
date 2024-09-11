package com.ABCRestaurant.ABC_Restaurant.controller;

import com.ABCRestaurant.ABC_Restaurant.dto.PaymentDetailsDTO;
import com.ABCRestaurant.ABC_Restaurant.service.PaymentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/payment")
@CrossOrigin
public class PaymentDetailsController {
    @Autowired
    private PaymentDetailsService paymentDetailsService;

    @GetMapping("/getPayments")
    public List<PaymentDetailsDTO> getReservations(){
        return paymentDetailsService.getAllPayments();
    }

    @PostMapping("/savePayment")
    public PaymentDetailsDTO savePayment(@RequestBody PaymentDetailsDTO paymentDetailsDTO){
        return paymentDetailsService.savePayment(paymentDetailsDTO);
    }

    @PutMapping("/updatePayment")
    public PaymentDetailsDTO updatePayment(@RequestBody PaymentDetailsDTO paymentDetailsDTO){
        return paymentDetailsService.updatePayment(paymentDetailsDTO);
    }

    @DeleteMapping("/deletePayment/{Id}")
    public boolean deletePaymentById(@PathVariable int Id){
        return paymentDetailsService.deletePaymentById(Id);
    }
}
