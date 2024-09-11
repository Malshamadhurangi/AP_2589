package com.ABCRestaurant.ABC_Restaurant.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserFeedbackDTO {
    private int Id;
    private String Name;
    private String Feedback;
}
