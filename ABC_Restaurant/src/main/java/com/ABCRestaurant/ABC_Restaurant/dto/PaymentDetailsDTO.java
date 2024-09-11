package com.ABCRestaurant.ABC_Restaurant.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentDetailsDTO {
    private int Id;
    private String CustomerName;
    private String Amount;
    private String PaymentDate;
    private String Quantity;
    private String status;
}
