package com.ABCRestaurant.ABC_Restaurant.repo;

import com.ABCRestaurant.ABC_Restaurant.entity.PaymentDetails;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface PaymentDetailsRepo extends JpaRepository<PaymentDetails,String>{

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM payment_details WHERE id = ?1", nativeQuery = true)
    void deletePaymentById (int Id);


}
