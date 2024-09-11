package com.ABCRestaurant.ABC_Restaurant.service;

import com.ABCRestaurant.ABC_Restaurant.dto.PaymentDetailsDTO;
import com.ABCRestaurant.ABC_Restaurant.entity.PaymentDetails;
import com.ABCRestaurant.ABC_Restaurant.repo.PaymentDetailsRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PaymentDetailsService {
    @Autowired
    private PaymentDetailsRepo paymentDetailsRepo;

    @Autowired
    private ModelMapper modelMapper;

    public PaymentDetailsDTO savePayment(PaymentDetailsDTO paymentDetailsDTO){
        paymentDetailsRepo.save(modelMapper.map(paymentDetailsDTO, PaymentDetails.class));
        return paymentDetailsDTO;
    }

    public List<PaymentDetailsDTO> getAllPayments(){
        List<PaymentDetails> paymentsList=paymentDetailsRepo.findAll();
        return modelMapper.map(paymentsList, new TypeToken<List<PaymentDetailsDTO>>(){}.getType());
    }

    public PaymentDetailsDTO updatePayment(PaymentDetailsDTO paymentDetailsDTO){
        paymentDetailsRepo.save(modelMapper.map(paymentDetailsDTO, PaymentDetails.class));
        return paymentDetailsDTO;
    }

    public boolean deletePaymentById(int Id){
        paymentDetailsRepo.deletePaymentById(Id);
        return true;
    }
}
