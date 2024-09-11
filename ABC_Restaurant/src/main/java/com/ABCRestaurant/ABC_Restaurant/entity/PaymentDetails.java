package com.ABCRestaurant.ABC_Restaurant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentDetails {
    @Id
    private int Id;
    private String CustomerName;
    private String Amount;
    private String PaymentDate;
    private String Quantity;
    private String status;
}
